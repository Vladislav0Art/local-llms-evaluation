package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class Generated[setRenavam_EmptyString_MustReturnNull]{

@Test
public void [setRenavam_EmptyString_MustReturnNull](){
final String renavam = "";
final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
final Object result = obj.setRenavam(renavam);

assertEquals(null,result);
	}

            }