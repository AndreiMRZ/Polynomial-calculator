package Operatii;

import Model.Monom;
import Model.Polinom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiplicClass implements PolynomialOp {


    @Override
    public Polinom forAll(Polinom p1, Polinom p2) {
        HashMap<Integer , Float> hash_map = new HashMap<>();
        for(Monom i : p1.getListOfMonom()){
            for(Monom j : p2.getListOfMonom()){
                hash_map.put(i.getPutere() + j.getPutere(), i.getCoef()*j.getCoef());
            }
        }
        List<Monom> mList = new ArrayList<>();

        for(Map.Entry<Integer, Float> x:hash_map.entrySet()){
            Monom m = new Monom(x.getKey(), x.getValue());
            mList.add(m);
        }
        return new Polinom(mList);
}

}
