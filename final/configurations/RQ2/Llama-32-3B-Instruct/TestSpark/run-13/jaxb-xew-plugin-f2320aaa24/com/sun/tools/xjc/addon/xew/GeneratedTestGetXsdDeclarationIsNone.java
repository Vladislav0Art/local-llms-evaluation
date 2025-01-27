package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetXsdDeclarationIsNone {

    @Mock
    private JClassContainer container;

    @Mock
    private CommonConfiguration config;

    @Test
    public void testGetXsdDeclarationIsNone() {
        when(config.getXsdDeclaration()).thenReturn(null);
        XSDeclaration result = XmlElementWrapperPlugin.getXsdDeclaration(container, config);
        assertNull(result);
    }

}