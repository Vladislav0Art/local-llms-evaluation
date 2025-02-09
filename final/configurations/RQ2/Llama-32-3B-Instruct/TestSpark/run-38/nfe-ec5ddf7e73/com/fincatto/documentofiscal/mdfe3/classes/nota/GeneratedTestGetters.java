package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestGetters {

    // Add your implementation here...
}

public class MDFInfoModalRodoviarioVeiculoReboque {
    private DFStringValidador validador;

    public void setValidador(DFStringValidador validador) {
        this.validador = validador;
    }

    public void setCodigoInterno(String codigointerno) {
        // Add your implementation here...
    }

    public void setPlaca(String placa) {
        // Add your implementation here...
    }

    public void setRenavam(String renavam) {
        // Add your implementation here...
    }

    public void setTara(String tara) {
        // Add your implementation here...
    }
}

public class GeneratedTest extends TestBase {
    private MDFInfoModalRodoviarioVeiculoReboque modal;

    @Before
    public void setup() {
        this.modal = new MDFInfoModalRodoviarioVeiculoReboque();
        this.modal.setValidador(new DFStringValidador());
        this.modal.setCodigoInterno("teste");
        this.modal.setPlaca("placa");
        this.modal.setRenavam("renavam");
        this.modal.setTara("tara");
    }

    @Test
    public void testGetters() {
        // Add your implementation here...
    }
}

public class DFStringValidadorImpl implements DFStringValidador {
    // Add your implementation here...
}

public class MDFInfoModalRodoviarioVeiculoReboqueImpl implements MDFInfoModalRodoviarioVeiculoReboque {
    @Override
    public void setValidador(DFStringValidador validador) {
        this.validador = validador;
    }

    @Override
    public void setCodigoInterno(String codigointerno) {
        // Add your implementation here...
    }

    @Override
    public void setPlaca(String placa) {
        // Add your implementation here...
    }

    @Override
    public void setRenavam(String renavam) {
        // Add your implementation here...
    }

    @Override
    public void setTara(String tara) {
        // Add your implementation here...
    }
}

}