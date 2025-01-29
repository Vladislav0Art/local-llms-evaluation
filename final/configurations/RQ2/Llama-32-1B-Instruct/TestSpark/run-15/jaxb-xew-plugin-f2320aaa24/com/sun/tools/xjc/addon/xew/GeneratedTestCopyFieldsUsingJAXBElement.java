package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFieldsUsingJAXBElement {

    @Test
    public void testCopyFieldsUsingJAXBElement() {
        JAXBElement element = new JAXBElement();
        // Create fields in the element using copyFields method
        copyFields(element, "field1", "type");
        copyFields(element, "field2", "type");

        // Get the copied fields
        JFieldVar[] copiedFields = element.getFields();

        assert !copiedFields[0].getName().isEmpty();
        assert !copiedFields[1].getName().isEmpty();
    }

}