package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetRenavam {

    private String codigoInterno;
    private String placa;
    private String renavam;
    private int tara;
    private double capacidadeKG;
    private double capacidadeM3;

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public void setCapacidadeKG(double capacidadeKG) {
        if (capacidadeKG < 0) {
            throw new IllegalArgumentException("Capacidade KG não pode ser negativa.");
        }
        this.capacidadeKG = capacidadeKG;
    }

    public void setCapacidadeM3(double capacidadeM3) {
        if (capacidadeM3 < 0) {
            throw new IllegalArgumentException("Capacidade M3 não pode ser negativa.");
        }
        this.capacidadeM3 = capacidadeM3;
    }
}

public class GeneratedTest {

    @Test
    public void testSetRenavam() {
        String renavam = "ABC123";
        MdfInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MdfInfoModalRodoviarioVeiculoReboque();
        boolean resultado = mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
    }

}