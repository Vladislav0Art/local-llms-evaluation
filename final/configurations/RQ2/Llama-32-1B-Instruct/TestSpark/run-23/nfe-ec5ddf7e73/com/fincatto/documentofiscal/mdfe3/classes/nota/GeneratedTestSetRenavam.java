package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetRenavam {

    private String capacidadeKG;
    private String placa;
    private String renavam;
    private String tara;

    public void setCapacidadeKG(String kg) {
        this.capacidadeKG = kg;
    }

    public void setPlaca(String rodoviarioVeiculoReboque) {
        if (rodoviarioVeiculoReboque != null && !rodoviarioVeiculoReboque.equals("null")) {
            this.placa = rodoviarioVeiculoReboque;
        } else {
            throw new IllegalArgumentException("Rodoviário e veículo não encontrado");
        }
    }

    public void setRenavam(String renavam) {
        if (renavam != null && !renavam.equals("null")) {
            this.renavam = renavam;
        } else {
            throw new IllegalArgumentException("Renavam não encontrado");
        }
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getCapacidadeKG() {
        return capacidadeKG;
    }

    public String getPlaca() {
        return placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public String getTara() {
        return tara;
    }
}

public class MdfInfoModalRodoviarioVeiculoReboqueTest {

    @Test
    public void testSetRenavam() {
        MdfInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MdfInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam("123");
        assertEquals(123, mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}