package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestHasPropertyNameCustomizationIsFalse {

    @Mock
    private JClassContainer container;

    @Mock
    private CommonConfiguration config;

    @Test
    public void testHasPropertyNameCustomizationIsFalse() {
        when(config.hasPropertyNameCustomization()).thenReturn(false);
        boolean result = XmlElementWrapperPlugin.hasPropertyNameCustomization(container, config);
        assertFalse(result);
    }

}