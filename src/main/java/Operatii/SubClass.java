package Operatii;

import Model.Monom;
import Model.Polinom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubClass implements PolynomialOp {

    @Override
    public Polinom forAll(Polinom p1, Polinom p2) {

        HashMap<Integer, Float> hash_map = new HashMap<>();
        putIntoHash(hash_map, p1);
        putIntoHash(hash_map, p2);
        List<Monom> mList = new ArrayList<>();

        for(Map.Entry<Integer, Float> x:hash_map.entrySet()){
            Monom add = new Monom(x.getKey(), x.getValue());
            mList.add(add);
        }
        return new Polinom(mList);
    }
    private void putIntoHash(HashMap<Integer, Float> hash_map, Polinom p){
        for(Monom i : p.getListOfMonom()){
            if(hash_map.containsKey(i.getPutere())){
                hash_map.put(i.getPutere(), (hash_map.get(i.getPutere())-i.getCoef()));
            }
            else
            {
                hash_map.put(i.getPutere(), i.getCoef());
            }
        }
    }
}
