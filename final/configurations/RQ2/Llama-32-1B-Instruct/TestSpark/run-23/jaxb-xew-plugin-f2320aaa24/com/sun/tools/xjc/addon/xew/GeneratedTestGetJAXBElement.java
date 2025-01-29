package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetJAXBElement {

    @Test
    public void testGetJAXBElement() {
        JClass jclass = getAnnotation(JElement.class).getDeclaringClass();
        JAXBElement element = (JAXBElement) jclass.getFields().get(0);
        assertNotNull(element);
        assertEquals("test", element.getXMLSchema());
    }

}