package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetAnnotationIsCustom {

    @Mock
    private JClassContainer container;

    @Mock
    private CommonConfiguration config;

    @Test
    public void testGetAnnotationIsCustom() {
        when(config.getAnnotationClass()).thenReturn(AnnotationClass.class);
        @Mock
        private JAnnotationUse annotation;
        when(container.getAnnotationUse(Mockito.any(QName.class))).thenReturn(annotation);
        Object result = XmlElementWrapperPlugin.getAnnotation(container, config);
        assertEquals(AnnotationClass.class, result.getClass());
    }

}