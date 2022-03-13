import Model.Monom;
import Model.Polinom;
import Operatii.IntegrationClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntegrationClassTest {

    @Test
    void forAll1() {
        Polinom p1 = new Polinom(Arrays.asList(new Monom(3, 4), new Monom(2, 3)));
        Polinom expected = new Polinom(Arrays.asList(new Monom(4,1), new Monom(3, 1)));
        IntegrationClass in = new IntegrationClass();
        Polinom actual = in.forAll1(p1);
        assertEquals(expected.toString(), actual.toString());
    }
}