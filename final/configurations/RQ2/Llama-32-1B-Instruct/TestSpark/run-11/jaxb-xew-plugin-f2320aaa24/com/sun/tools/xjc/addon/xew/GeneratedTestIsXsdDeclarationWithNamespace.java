package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsXsdDeclarationWithNamespace {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testIsXsdDeclarationWithNamespace() {
        // Given
        Element element = new Element();
        addXsdDeclaration(element);
        QName qname = new QName("http://example.com", "ns");

        // When
        isXsdDeclarationWithNamespace(element, qname);

        // Then
        assertTrue(getPropertyInfo(element, "attribute").isXsdDeclarationWithNamespace(qname));
    }

}