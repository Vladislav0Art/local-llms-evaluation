package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetCapacidadeKG_InvalidLength {

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
        public void testSetCapacidadeKG_InvalidLength() {
            Capacidade capacidade = new Capacidade();
            capacidade.setKg("123456");
            assertNotEquals(0, capacidade.getLength());
        }
    }

}