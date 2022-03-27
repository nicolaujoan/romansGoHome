package edu.poniperro.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import edu.poniperro.RomanNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TestRomanNumber {
        public RomanNumber numeroRomano;

        /**
         * Grupos sumatorios M, C, X, I
         */

        @ParameterizedTest
        @CsvSource({
                "1000,  M",
                "2000,  UMMU",
                "3000,  UMMMU"
        })
        public void grupo_M_test(Short decimal, String roman) {

            //String testCase = "M";
            numeroRomano = new RomanNumber(roman);
            assertEquals(decimal, numeroRomano.toDecimal());

            /**
             * El caso MMMM es control de errores
             * y no puede estar en el test de la logica
             * Asumimos que la entrada es correcta.
             * Sino, hay que programar la gestion de errores
             */
        }

        @Test
        public void tres_repeticiones_C_test() {

            String testCase = "UMMMUCCCU";
            numeroRomano = new RomanNumber(testCase);
            assertEquals(3300, numeroRomano.toDecimal());
        }

        @Test
        public void tres_repeticiones_X_test() {

            String testCase = "UMMMUXXXU";
            numeroRomano = new RomanNumber(testCase);

            assertEquals(3030, numeroRomano.toDecimal());
        }

        @Test
        public void tres_repeticiones_I_test() {

            String testCase = "UMMMUIIIU";
            numeroRomano = new RomanNumber(testCase);

            assertEquals(3003, numeroRomano.toDecimal());
        }

        @Test
        public void una_D_test() {

            String testCase = "UMMMUDUIIIU";
            numeroRomano = new RomanNumber(testCase);
            assertEquals(3503, numeroRomano.toDecimal());

            testCase = "MMMUCDUIIIU";
            numeroRomano = new RomanNumber(testCase);
            assertNotEquals(3503, numeroRomano.toDecimal());
        }

        /**
         * Grupos sustractivos
         * IV(4), IX(9),
         * XL(40), XC(90),
         * CD(400), CM(900)
         */

        @Test
        public void grupo_C_DM_test() {

            String testCase = "UCDU";
            numeroRomano = new RomanNumber(testCase);
            assertEquals(400, numeroRomano.toDecimal());

            testCase = "UCMU";
            numeroRomano = new RomanNumber(testCase);
            assertEquals(900, numeroRomano.toDecimal());
        }

        @Test
        public void grupo_X_LC_test() {

            String testCase = "UXLU";
            numeroRomano = new RomanNumber(testCase);
            assertEquals(40, numeroRomano.toDecimal());

            testCase = "UXCU";
            numeroRomano = new RomanNumber(testCase);
            assertEquals(90, numeroRomano.toDecimal());
        }

        @Test
        public void grupo_I_VX_test() {

            String testCase = "UIVU";
            numeroRomano = new RomanNumber(testCase);
            assertEquals(4, numeroRomano.toDecimal());

            testCase = "UIXU";
            numeroRomano = new RomanNumber(testCase);
            assertEquals(9, numeroRomano.toDecimal());
        }

        @Test
        public void grupos_sumatorios_tres_digitos_test() {
            String testCase = "MMMDCCCLXXXVIII"; // 3888
            numeroRomano = new RomanNumber(testCase);
            assertEquals(3888, numeroRomano.toDecimal());
        }

        @Test
        public void grupos_sumatorios_test() {
            String testCase = "MMDCCLXXVII"; // 2777
            numeroRomano = new RomanNumber(testCase);
            assertEquals(2777, numeroRomano.toDecimal());
        }

        @Test
        public void grupos_substractivos_test() {
            String testCase = "CDXLIV"; // 444
            numeroRomano = new RomanNumber(testCase);
            assertEquals(444, numeroRomano.toDecimal());

            testCase = "CDXXXIX"; // 439
            numeroRomano = new RomanNumber(testCase);
            assertEquals(439, numeroRomano.toDecimal());
        }

        /**
         * Test de la coleccion de
         * expresiones regulares
         */
}
