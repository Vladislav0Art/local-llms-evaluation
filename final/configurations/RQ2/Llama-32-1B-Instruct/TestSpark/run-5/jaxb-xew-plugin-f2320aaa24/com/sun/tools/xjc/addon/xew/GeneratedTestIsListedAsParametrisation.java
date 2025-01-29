package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsListedAsParametrisation {

    private static final String XML_ELEMENT_NAME = "element";

    @Test
    public void testIsListedAsParametrisation() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        setPrivateField(annotation, "is Listed As Parmetisation");
        assertTrue(isListedAsParametrisation(annotation));
        clearIs Listed AsParmetisation(annotation);
    }

}