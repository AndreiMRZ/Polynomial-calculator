package Operatii;

import Model.Monom;
import Model.Polinom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegrationClass implements OnePoliOp {

    @Override
    public Polinom forAll1(Polinom p1) {
        HashMap<Integer, Float> hash_map = new HashMap<>();
        putIntoHash(hash_map, p1);
        List<Monom> mList = new ArrayList<>();

        for(Map.Entry<Integer, Float> x:hash_map.entrySet()){
            Monom m = new Monom(x.getKey(), x.getValue());
            mList.add(m);
        }
        return new Polinom(mList);
    }
    private void putIntoHash (HashMap<Integer, Float> hash_map, Polinom p){
        for(Monom i : p.getListOfMonom()){
            if(i.getPutere() != 0){
                hash_map.put(i.getPutere() + 1, i.getCoef()/(i.getPutere() + 1));
            }
        }
    }
}
