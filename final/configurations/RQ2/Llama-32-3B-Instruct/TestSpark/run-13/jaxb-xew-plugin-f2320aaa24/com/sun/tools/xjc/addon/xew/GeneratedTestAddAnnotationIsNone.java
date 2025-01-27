package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAddAnnotationIsNone {

    @Mock
    private JClassContainer container;

    @Mock
    private CommonConfiguration config;

    @Test
    public void testAddAnnotationIsNone() {
        when(config.getAnnotationClass()).thenReturn(null);
        @Mock
        private JAnnotatable annotatable;
        when(container.getAnnotationUse(Mockito.any(QName.class))).thenReturn(annotatable);
        Object result = XmlElementWrapperPlugin.addAnnotation(container, config);
        assertNull(result);
    }

}