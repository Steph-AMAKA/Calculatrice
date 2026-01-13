import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculTest {

    @Test
    void sum() {
        assertEquals(5,Calcul.Sum(2, 3));
    }

    @Test
    void div(){
       int a = 2;
       int b = 2;
       int c ;
       Calcul calcul = new Calcul();
       c = calcul.division(a,b);
       assertEquals(1,c);
    }
    @Test
    void divParZero(){

        Calcul calcul = new Calcul();

        assertThrows(IllegalArgumentException.class, () -> {
            calcul.division(10, 0);
        });
    }

    @Test
    void dif(){
        int a = 3;
        int b = 3;
        int c;
        Calcul calcul = new Calcul();
        c = calcul.division(a,b);
        assertEquals(1,c);
    }

    @Test
    void prod(){
        int a = 3;
        int b = 3;
        int c;

        Calcul calcul = new Calcul();

        c = calcul.multiply(a,b);
        assertEquals(9,c);
    }



}