package com.sun.tools.xjc.addon.xew;

public class GeneratedGetXsdDeclarationTest {

    @Test
    public void getXsdDeclarationTest() throws Exception {
        // Given
        String xsd = "<xsd:schema><xsd:element name=\"test\" type=\"xsd:string\"/></xsd:schema>";

        // When
        XSDepclaration result = XmlElementWrapperPlugin.getXsdDeclaration(xsd);

        // Then
        assertNotNull(result);
    }

}