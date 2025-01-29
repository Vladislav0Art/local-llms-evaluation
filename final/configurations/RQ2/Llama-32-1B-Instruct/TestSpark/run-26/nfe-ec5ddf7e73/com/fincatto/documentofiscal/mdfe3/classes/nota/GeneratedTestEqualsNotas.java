package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestEqualsNotas {

    public int getCodigoInterno() {
        return 123;
    }

    public String getPlaca() {
        return "ABC";
    }

    public String getRenavam() {
        return "DEF";
    }

    public double getTara() {
        return 1.2;
    }

    public int getCapacidadeKG() {
        return 5;
    }

    public int getCapacidadeM3() {
        return 10;
    }
}

public class GeneratedTest {

    @Test
    public void testEqualsNotas() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();

        assertEquals(123, nota1.getCodigoInterno());
        assertEquals("ABC", nota1.getPlaca());

        assertEquals(nota2.getCodigoInterno(), nota1.getCodigoInterno()); // public
        assertEquals(nota2.getPlaca(), nota1.getPlaca());     // public

        assertEquals(1.2, nota1.getTara(), 0);              // public
        assertEquals(1.2, nota2.getTara(), 0);              // public

        assertEquals(5, nota1.getCapacidadeKG());           // public
        assertEquals(10, nota2.getCapacidadeKG());          // public

        assertEquals(10, nota1.getCapacidadeM3(), 0);      // public
    }

}