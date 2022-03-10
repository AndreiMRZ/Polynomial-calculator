import Model.Monom;
import Model.Polinom;
import Operatii.AddClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AddClassTest {


    @Test
    void forAll() {
        Polinom p1 = new Polinom(Arrays.asList(new Monom(3, 2), new Monom(2, 3)));
        Polinom p2 = new Polinom(Arrays.asList(new Monom(3, 4), new Monom(2, 5), new Monom(1, 1)));
        Polinom expected = new Polinom(Arrays.asList(new Monom(3,6), new Monom(2, 8), new Monom(1,1)));
      AddClass add = new AddClass();
      Polinom actual = add.forAll(p1, p2);
      assertEquals(expected, actual);
    }
}