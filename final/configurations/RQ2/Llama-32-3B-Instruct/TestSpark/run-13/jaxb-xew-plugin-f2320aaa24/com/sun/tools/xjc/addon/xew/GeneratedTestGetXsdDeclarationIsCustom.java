package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetXsdDeclarationIsCustom {

    @Mock
    private JClassContainer container;

    @Mock
    private CommonConfiguration config;

    @Test
    public void testGetXsdDeclarationIsCustom() {
        when(config.getXsdDeclaration()).thenReturn(new XSDeclaration("Custom XSD Declaration"));
        XSDeclaration result = XmlElementWrapperPlugin.getXsdDeclaration(container, config);
        assertEquals("Custom XSD Declaration", result.toString());
    }

}