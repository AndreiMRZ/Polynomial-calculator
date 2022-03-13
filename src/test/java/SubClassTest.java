import Model.Monom;
import Model.Polinom;
import Operatii.SubClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SubClassTest {

    @Test
    void forAll() {
        Polinom p1 = new Polinom(Arrays.asList(new Monom(3, 2), new Monom(2, 3)));
        Polinom p2 = new Polinom(Arrays.asList(new Monom(3, 4), new Monom(2, 5), new Monom(1, 1)));
        Polinom expected = new Polinom(Arrays.asList(new Monom(1,1), new Monom(2, -2), new Monom(3,-2)));
       SubClass subb = new SubClass();
        Polinom actual = subb.forAll(p1,p2);
        assertEquals(expected.toString(), actual.toString());
    }
}