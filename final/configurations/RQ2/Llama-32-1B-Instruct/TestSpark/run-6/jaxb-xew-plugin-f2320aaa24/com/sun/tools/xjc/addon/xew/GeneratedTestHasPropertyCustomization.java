package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHasPropertyCustomization {

    @Test
    public void testHasPropertyCustomization() {
        CCustomizations properties = new CCustomizations();
        properties.setProperty("attr", true);
        String xmlString = CommonUtils.generableToString(properties);
        assertNotNull(xmlString);
        assertEquals("<xs:element name=\"attr\" xsd:type=\"xs:string\" xsd:default-value=\"\"/>", xmlString);
    }

}