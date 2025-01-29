package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementRef {

    @Test
    public void testXmlElementRef() {
        Object ref = getAnnotationReference(jclass, "test-ref");
        assertNotNull(ref);
        assertTrue(isinstance(ref, Class < ? extends XMSTypes.XMLElement_REF >));
    }

}