package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class Generated[setTara_EmptyString_MustReturnNull]{

@Test
public void [setTara_EmptyString_MustReturnNull](){
final String tara = "";
final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
final Object result = obj.setTara(tara);

assertEquals(null,result);
	}

            }