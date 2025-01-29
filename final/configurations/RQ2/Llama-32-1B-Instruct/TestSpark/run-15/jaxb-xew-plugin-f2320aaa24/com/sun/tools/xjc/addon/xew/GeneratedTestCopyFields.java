package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFields {

    @Test
    public void testCopyFields() {
        JClassContainer container = new JClassContainer();
        // Create fields in the container
        FieldVar field1 = new FieldVar("field1", "type");
        FieldVar field2 = new FieldVar("field2", "type");

        // Copy fields using copyFields method
        copyFields(container, field1);
        copyFields(container, field2);

        // Get the copied fields
        JFieldVar[] copiedFields = container.getFields();

        assert !copiedFields[0].getName().isEmpty();
        assert !copiedFields[1].getName().isEmpty();
    }

}