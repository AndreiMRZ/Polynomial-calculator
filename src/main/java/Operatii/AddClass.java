package Operatii;

import Model.Monom;
import Model.Polinom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddClass implements PolynomialOp {

   @Override
    public Polinom forAll(Polinom p1, Polinom p2) {

       HashMap<Integer, Float> hash_map = new HashMap<Integer, Float>();
       putInto(hash_map, p1);
       putInto(hash_map, p2);
       List<Monom> monomList = new ArrayList<>();

       for(Map.Entry<Integer, Float> e:hash_map.entrySet()){
             Monom m = new Monom(e.getKey(), e.getValue());
            monomList.add(m);
         }
       return new Polinom(monomList);
       }

    private void putInto (HashMap<Integer, Float> hash_map, Polinom p){
       for(Monom mono : p.getListOfMonom()){
           if(hash_map.containsKey(mono.getPutere())){
               hash_map.put( mono.getPutere(),  (hash_map.get(mono.getPutere()) + mono.getCoef()));
           }
           else
           {
               hash_map.put((int) mono.getPutere(), mono.getCoef());
           }

       }
    }


}

