import Model.Monom;
import Model.Polinom;
import Operatii.MultiplicClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicClassTest {

    @Test
    void forAll() {
        Polinom p1 = new Polinom(Arrays.asList(new Monom(3, 1), new Monom(1, 1)));
        Polinom p2 = new Polinom(Arrays.asList(new Monom(2, 3), new Monom(1, 1)));
        Polinom expected = new Polinom(Arrays.asList(new Monom(5,3), new Monom(4, 1), new Monom(3, 3), new Monom(2, 1)));
        MultiplicClass mul = new MultiplicClass();
        Polinom actual = mul.forAll(p1,p2);
        assertEquals(expected.toString(), actual.toString());
    }
}