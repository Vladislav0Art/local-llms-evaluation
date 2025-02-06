package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class Generated[setPlaca_EmptyString_MustReturnNull]{

@Test
public void [setPlaca_EmptyString_MustReturnNull](){
final String placa = "";
final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
final Object result = obj.setPlaca(placa);

assertEquals(null,result);
	}

            }