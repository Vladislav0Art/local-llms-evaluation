package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class Generated[setCodigoInterno_EmptyString_MustReturnNull]{

@Test
public void [setCodigoInterno_EmptyString_MustReturnNull](){
final String codigoInterno = "";
final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
final Object result = obj.setCodigoInterno(codigoInterno);

assertEquals(null,result);
	}

            }