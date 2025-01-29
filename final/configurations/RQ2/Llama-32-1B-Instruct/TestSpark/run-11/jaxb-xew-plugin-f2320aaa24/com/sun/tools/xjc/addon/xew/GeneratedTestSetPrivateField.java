package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetPrivateField {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testSetPrivateField() {
        // Given
        JClassClassContainer container = new JClassClassContainer();
        Element element = new Element();

        // When
        setPrivateField(container, element);

        // Then
        assertTrue(getPropertyInfo(element, "attribute").getPrivate());
    }

}