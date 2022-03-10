package Model;

import Model.Monom;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polinom {
    private List<Monom>monomList;

    public Polinom() {
        this.monomList = new ArrayList<Monom>();
    }


    public Polinom(List<Monom> monomList1) {

        Collections.sort(monomList1);
        this.monomList = monomList1;
    }

    public void addMonom(Monom monom) {
        monomList.add(monom);
    }

    public boolean verifError(String string){
        String standard = "x^1234567890-+";
        for(String index: string.split("")){
            if(!standard.contains(index)){
                return false;
            }
        }
        return true;
    }

    public void transformP(String string) throws Exception {
        final String regex = "([+-]?\\d*)x(\\^(\\d+))?|([+-]?\\d+)";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        if(!verifError(string)){
            throw new Exception("Incorect");
        }

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                float coef = matcher.group(1).equals("") ? 1 : (float) (matcher.group(1).equals("-") ? -1 : matcher.group(1).equals("+") ? +1 : Double.parseDouble(matcher.group(1)));
                int exp = matcher.group(3) == null ? 1 : (int) Double.parseDouble(matcher.group(3));
                addMonom(new Monom(exp, coef));
            } else if(matcher.group(3) != null){
                addMonom(new Monom(matcher.group(3).equals("") ? 1 : (int) Double.parseDouble(matcher.group(3)), 0));
            } else {
                addMonom(new Monom(0, (float) Double.parseDouble(matcher.group(4))));
            }
        }

    }

    public void setListOfMonom(List<Monom> listOfMonom) {
        this.monomList = listOfMonom;
    }

    public List<Monom> getListOfMonom() {
        return monomList;
    }

    public void polinomSortare(){
        Collections.sort(monomList, new Comparator<>() {
            @Override
            public int compare(Monom o1, Monom o2) {
                return o1.compareTo(o2);
            }
        });
    }

    @Override
    public String toString() {
        String afisare = "";
        for(Monom m: getListOfMonom()){
            afisare += (m.getCoef() < 0 && m.getCoef() != -1.0f ? m.getCoef()
                    : m.getCoef() < 0.0f && m.getCoef() == -1.0f && m.getPutere() == 0.0f ? "-1"
                    : m.getCoef() < 0.0f && m.getCoef() == -1.0f && m.getPutere() != 0.0f ? "-"
                    : m.getCoef() == 1.0f && m.getPutere() != 0.0f ? "+"
                    : m.getCoef() == 1.0f && m.getPutere() == 0.0f ? "+1" : "+" + m.getCoef()) +
                    (m.getPutere() > 1.0f ? "x^"+m.getPutere() : m.getPutere() > 0.0f ? "x" : "" );
        }
        return afisare;
    }


}
