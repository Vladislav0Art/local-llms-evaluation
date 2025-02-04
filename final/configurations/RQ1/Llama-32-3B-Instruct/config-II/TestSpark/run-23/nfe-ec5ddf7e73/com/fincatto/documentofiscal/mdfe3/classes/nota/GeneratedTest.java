package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void novoObjetoVazio() {
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assert mdf.getCodigoInterno().isEmpty();
        assert mdf.getPlaca().isEmpty();
        assert mdf.getRenavam().isEmpty();
        assert mdf.getTara().isEmpty();
        assert mdf.getCapacidadeKG().isEmpty();
        assert mdf.getCapacidadeM3().isEmpty();
    }

    @Test
    public void codigoInternoValido() {
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCodigoInterno("1234567890");
        assertTrue(mdf.getCodigoInterno().equals("1234567890"));
    }

    @Test
    public void placaDeVeiculoValida() {
        String placa = "ABC123";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setPlaca(placa);
        assertTrue(MDFInfoModalRodoviarioVeiculoReboque.class.isInstance(mdf));
    }

    @Test
    public void placaInvalida() {
        String placa = "AB";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdf.setPlaca(placa));
    }

    @Test
    public void renavamValido() {
        String renavam = "123456789";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam(renavam);
        assertTrue(mdf.getRenavam().equals("123456789"));
    }

    @Test
    public void renavamInvalido() {
        String renavam = "AB";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdf.setRenavam(renavam));
    }

    @Test
    public void taraValida() {
        String tara = "12345";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setTara(tara);
        assertTrue(mdf.getTara().equals("12345"));
    }

    @Test
    public void taraInvalida() {
        String tara = "AB";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdf.setTara(tara));
    }

    @Test
    public void capacidadeKGValido() {
        String capacidadeKG = "12.34";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(capacidadeKG);
        assertTrue(mdf.getCapacidadeKG().equals("12.34"));
    }

    @Test
    public void capacidadeKGLimitada() {
        String capacidadeKG = "12345678901234567890";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdf.setCapacidadeKG(capacidadeKG));
    }

    @Test
    public void capacidadeM3Valido() {
        String capacidadeM3 = "12";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3(capacidadeM3);
        assertTrue(mdf.getCapacidadeM3().equals("12"));
    }

    @Test
    public void capacidadeM3Limitada() {
        String capacidadeM3 = "12345678901234567890";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdf.setCapacidadeM3(capacidadeM3));
    }

}