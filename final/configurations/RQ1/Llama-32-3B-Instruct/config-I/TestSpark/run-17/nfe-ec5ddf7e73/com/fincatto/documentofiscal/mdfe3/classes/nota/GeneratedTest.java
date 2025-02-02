package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    private static class Capacidade {
        private String kg;

        public void setKg(String kg) {
            this.kg = kg;
        }

        public int getLength() {
            return kg.length();
        }
    }

    @

    public
    public static class TestCapacidadeKG {

        @Test
        public void testSetCapacidadeKG_ValidLength() {
            Capacidade capacidade = new Capacidade();
            capacidade.setKg("1234");
            assertEquals(4, capacidade.getLength());
        }

        @Test
        public void testSetCapacidadeKG_InvalidLength() {
            Capacidade capacidade = new Capacidade();
            capacidade.setKg("123456");
            assertNotEquals(0, capacidade.getLength());
        }
    }

    @Test
    public void testSetCapacidadeM3_ValidLength() {
        CapacidadeM3 capacidadeM3 = new CapacidadeM3();
        capacidadeM3.setM3("1234");
        assertEquals(4, capacidadeM3.getLength());
    }

    @Test
    public void testSetCapacidadeM3_InvalidLength() {
        CapacidadeM3 capacidadeM3 = new CapacidadeM3();
        capacidadeM3.setM3("123456");
        assertNotEquals(0, capacidadeM3.getLength());
    }
}

}