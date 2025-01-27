package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetElementNameIsNone {

    @Mock
    private JClassContainer container;

    @Mock
    private CommonConfiguration config;

    @Test
    public void testGetElementNameIsNone() {
        when(config.getElementName()).thenReturn(null);
        String result = XmlElementWrapperPlugin.getElementName(container, config);
        assertEquals("Default Element Name", result);
    }

}