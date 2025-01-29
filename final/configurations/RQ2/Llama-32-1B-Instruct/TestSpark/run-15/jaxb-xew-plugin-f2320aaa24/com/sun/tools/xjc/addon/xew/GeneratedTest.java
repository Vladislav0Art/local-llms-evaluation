package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void testAddAnnotation() {
        JAnnotatable element = new JAnnotatable();
        // Add annotation using addAnnotation method
        addAnnotation(element, "name", "value");

        // Get the annotation value
        String name = getAnnotationValue(element);

        assert !name.isEmpty();
    }

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

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable element = new JAnnotatable();
        // Add annotation using addAnnotation method
        addAnnotation(element, "name", "value");

        // Get the annotation member value
        String name = getAnnotationMemberValue(element);

        assert !name.isEmpty();
    }

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

    @Test
    public void testHasPropertyNameCustomization() {
        JAnnotatable element = new JAnnotatable();
        // Add annotation using addAnnotation method
        addAnnotation(element, "name", "value");

        // Get the property name customization value
        String propertyNameCustomization = getPropertyNameCustomization(element);

        assert !propertyNameCustomization.isEmpty();
    }

    @Test
    public void testIsListedAsParametrisation() {
        JAnnotatable element = new JAnnotatable();
        // Add annotation using addAnnotation method
        addAnnotation(element, "name", "value");

        // Get the parametrisation value
        String parametrisation = getParameterisation(element);

        assert !parametrisation.isEmpty();
    }

    @Test
    public void testSetPrivateField() {
        JAnnotatable element = new JAnnotatable();
        // Add annotation using addAnnotation method
        addAnnotation(element, "name", "value");

        // Set a private field using setPrivateField method
        setPrivateField(element, "private_field_name", "value");

        // Get the private field value
        String privateFieldValue = getPrivateField(element);

        assert !privateFieldValue.isEmpty();
    }

}