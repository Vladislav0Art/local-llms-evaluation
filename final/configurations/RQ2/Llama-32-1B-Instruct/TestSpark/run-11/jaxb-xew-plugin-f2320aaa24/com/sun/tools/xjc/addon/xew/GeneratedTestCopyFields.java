package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFields {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testCopyFields() {
        // Given
        Element element = new Element();
        addField(element, "field");

        // When
        copyFields(element);

        // Then
        setPrivateField(element, "field");
    }

}