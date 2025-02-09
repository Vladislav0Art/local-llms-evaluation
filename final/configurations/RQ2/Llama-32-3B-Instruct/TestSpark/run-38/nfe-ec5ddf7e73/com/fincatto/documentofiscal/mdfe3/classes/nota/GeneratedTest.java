package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    public void validate(String input) {
        // Add your implementation here...
    }
}

public class MDFInfoModalRodoviarioVeiculoReboque {
    private String codigointerno;
    private String placa;
    private String renavam;
    private String tara;

    public void setCodigoInterno(String codigointerno) {
        this.codigointerno = codigointerno;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }
}

public class GeneratedTest extends TestBase {
    private MDFInfoModalRodoviarioVeiculoReboque modal;

    @Before
    public void setup() {
        this.modal = new MDFInfoModalRodoviarioVeiculoReboque();
        this.modal.setCodigoInterno("teste");
        this.modal.setPlaca("placa");
        this.modal.setRenavam("renavam");
        this.modal.setTara("tara");
    }

}