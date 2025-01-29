package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestAddAnyElementMultiple {

    @Test
    public void testAddAnyElementMultiple() {
        JAXBElement element1 = mock(JAXBElement.class);
        JAXBElement element2 = mock(JAXBElement.class);

        addAnyElement(jClass, element1);
        addAnyElement(jClass, element2);

        ObjectUtils.assertSame("element", getAnyElement(jClass, annotatable));
    }

}