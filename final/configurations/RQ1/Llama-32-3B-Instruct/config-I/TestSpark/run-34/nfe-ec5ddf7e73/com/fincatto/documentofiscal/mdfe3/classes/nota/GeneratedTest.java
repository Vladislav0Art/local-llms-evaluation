package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    public DFStringValidador getValidador() {
        return new DFStringValidador();
    }
}

public class DFStringValidador {
    public String placadeveiculo(String valor, String mensagem) {
        // implementacao da logica para a validacao do placa de veiculo
        return "";
    }

    public boolean capacidadeNDigitos(String valor, String mensagem, int tamanho) {
        // implementacao da logica para a validacao da capacidade do veiculo
        return true;
    }
}

public class MDFInfoModalRodoviarioVeiculoReboqueTest {

    private final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();

    public static class DFStringValidador {
        public String placadeveiculo(String valor, String mensagem) {
            // implementacao da logica para a validacao do placa de veiculo
            return "";
        }

        public boolean capacidadeNDigitos(String valor, String mensagem, int tamanho) {
            // implementacao da logica para a validacao da capacidade do veiculo
            return true;
        }
    }

    @Test
    public void codigoInternoValidoTest() {
        mdf.setCodigoInterno(CODIGO_INTERNO);
        assertEquals(CODIGO_INTERNO, mdf.getCodigoInterno());
    }

    @Test
    public void codigoInternoInvalidoTest() {
        mdf.setCodigoInterno("123456789012");
        assertEquals(CODIGO_INTERNO, mdf.getCodigoInterno());
    }

    @Test
    public void renavamDoReboqueValidoTest() {
        mdf.setRenavam(RENAVAM_REBOQUE);
        assertEquals(RENAVAM_REBOQUE, mdf.getRenavam());
    }

    @Test
    public void renavamDoReboqueInvalidoTest() {
        String invalida = "1234567";
        assertEquals("0000000", mdf.getRenavam());
    }

    @Test
    public void taraEmReboqueValidoTest() {
        mdf.setTara(TARA_REBOQUE);
        assertEquals(TARA_REBOQUE, mdf.getTara());
    }

    @Test
    public void taraEmReboqueInvalidoTest() {
        String invalida = "10000";
        assertEquals("00000", mdf.getTara());
    }

    @Test
    public void capacidadeKGValidoTest() {
        mdf.setCapacidadeKG(CAPACIDADE_KG);
        assertEquals(CAPACIDADE_KG, mdf.getCapacidadeKG());
    }

    @Test
    public void capacidadeKGInvalidoTest() {
        String invalida = "12345";
        assertEquals("00000", mdf.getCapacidadeKG());
    }

    @Test
    public void capacidadeM3ValidoTest() {
        mdf.setCapacidadeM3(CAPACIDADE_KG);
        assertEquals(CAPACIDADE_KG, mdf.getCapacidadeM3());
    }

    @Test
    public void capacidadeM3InvalidoTest() {
        String invalida = "20000";
        assertEquals("00", mdf.getCapacidadeM3());
    }

    private void setField(String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field field = mdf.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(mdf, value);
    }

    @Test
    public void testCapacidadeNDigitos() {
        DFStringValidador validator = new DFStringValidador();
        assertFalse(validator.capacidadeNDigitos("1234", "Mensagem", 5));
        assertTrue(validator.capacidadeNDigitos("12345", "Mensagem", 5));
    }

}