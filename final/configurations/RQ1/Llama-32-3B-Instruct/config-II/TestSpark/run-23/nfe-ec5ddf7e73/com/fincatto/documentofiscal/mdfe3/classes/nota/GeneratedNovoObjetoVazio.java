package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedNovoObjetoVazio {

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

}