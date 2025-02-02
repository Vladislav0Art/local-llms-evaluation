package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetCapacidadeKG_ValidLength {

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

    }