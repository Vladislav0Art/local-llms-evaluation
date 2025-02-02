package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetCapacidadeM3_ValidLength {

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
        public void testSetCapacidadeM3_ValidLength() {
            CapacidadeM3 capacidadeM3 = new CapacidadeM3();
            capacidadeM3.setM3("1234");
            assertEquals(4, capacidadeM3.getLength());
        }

    }