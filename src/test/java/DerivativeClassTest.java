import Model.Monom;
import Model.Polinom;
import Operatii.DerivativeClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DerivativeClassTest {

    @Test
    void forAll() {
        Polinom p1 = new Polinom(Arrays.asList(new Monom(3, 2), new Monom(2, 3)));
        Polinom expected = new Polinom(Arrays.asList(new Monom(2,6), new Monom(1, 6)));
        DerivativeClass der = new DerivativeClass();
        Polinom actual = der.forAll1(p1);
        assertEquals(expected, actual);
    }
}