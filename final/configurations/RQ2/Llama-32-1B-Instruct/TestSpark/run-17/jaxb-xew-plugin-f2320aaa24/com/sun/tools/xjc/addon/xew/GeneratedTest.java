package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void testAddAttribute() {
        JClass jClass = mock(JClass.class);
        JAnnotatable annotatable = mock(JAnnotatable.class);

        addAnnotation(jClass, "attribute");
        addAnnotation(annotatable, "attribute");

        JMethod method = mock(JMethod.class);
        method.invoke(jClass, annotatable);

        ObjectUtils.assertSame("attribute", method.invoke(jClass, annotatable));
    }

    @Test
    public void testCopyFields() {
        JClass jClass = mock(JClass.class);
        JFieldVar fieldVar = mock(JFieldVar.class);

        addAnnotation(fieldVar, "field");
        addAnnotation(jClass, "field");

        JMethod method = mock(JMethod.class);
        method.invoke(jClass, fieldVar);

        ObjectUtils.assertSame("field", method.invoke(jClass, fieldVar));
    }

    @Test
    public void testCopyFieldsMultiple() {
        JFieldVar fieldVar1 = mock(JFieldVar.class);
        JFieldVar fieldVar2 = mock(JFieldVar.class);

        addAnnotation(fieldVar1, "field");
        addAnnotation(fieldVar2, "field");

        JMethod method = mock(JMethod.class);
        method.invoke(jClass, fieldVar1, fieldVar2);

        ObjectUtils.assertSame("field", method.invoke(jClass, fieldVar1, fieldVar2));
    }

    @Test
    public void testCopyFieldsWithMultipleTypes() {
        JFieldVar fieldVar1 = mock(JFieldVar.class);
        JFieldVar fieldVar2 = mock(JFieldVar.class);

        addAnnotation(fieldVar1, "field");
        addAnnotation(fieldVar2, "field");

        JMethod method = mock(JMethod.class);
        method.invoke(jClass, fieldVar1, fieldVar2);

        ObjectUtils.assertSame("field", method.invoke(jClass, fieldVar1, fieldVar2));
    }

    @Test
    public void testSetPrivateField() {
        JAnnotatable annotatable = mock(JAnnotatable.class);
        JMethod method = mock(JMethod.class);

        addAnnotation(annotatable, "setPrivateField");

        setPrivateField(annotatable, "field");
        setPrivateField(annotatable, "field2");

        JClass jClass = mock(JClass.class);
        JMethod methodJClass = mock(JMethod.class);

        method.invoke(jClass, annotatable);

        ObjectUtils.assertSame("field", method.invoke(jClass, annotatable));
    }

    @Test
    public void testGetPrivateField() {
        JAnnotatable annotatable = mock(JAnnotatable.class);
        JMethod method = mock(JMethod.class);

        addAnnotation(annotatable, "getPrivateField");

        ObjectUtils.assertSame("field", getPrivateField(jClass, annotatable));
    }

    @Test
    public void testSetXmlAnyElement() {
        JAnnotatable annotatable = mock(JAnnotatable.class);
        JAXBElement element = mock(JAXBElement.class);

        addAnnotation(element);
        addAnnotation(annotatable);

        setXMLAnyElement(jClass, element);

        ObjectUtils.assertSame("element", getXMLAnyElement(jClass, annotatable));
    }

    @Test
    public void testSetXmlAnyElementMultiple() {
        JAXBElement element1 = mock(JAXBElement.class);
        JAXBElement element2 = mock(JAXBElement.class);

        addAnnotation(element1);
        addAnnotation(element2);

        setXMLAnyElement(jClass, element1, element2);

        ObjectUtils.assertSame("element", getXMLAnyElement(jClass, annotatable));
    }

    @Test
    public void testSetXmlAnyElementWithCustomization() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        addAnnotation(element);

        setXMLAnyElement(jClass, element);

        ObjectUtils.assertSame("element", getXMLAnyElement(jClass, annotatable));
    }

    @Test
    public void testSetXmlMixed() {
        JAXBElement element = mock(JAXBElement.class);
        JClass jClass = mock(JClass.class);
        CustomizationUtils.applyCustomization(element, "customization");

        setXMLMixed(jClass, element);

        ObjectUtils.assertSame("element", getXMLMixed(jClass, annotatable));
    }

    @Test
    public void testSetXmlSchema() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        addAnnotation(element);

        setXMLSchema(jClass, element);

        ObjectUtils.assertSame("element", getXMLSchema(jClass, annotatable));
    }

    @Test
    public void testSetXmlType() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        addAnnotation(element);

        setXMLType(jClass, element);

        ObjectUtils.assertSame("element", getXMLType(jClass, annotatable));
    }

    @Test
    public void testAddAnyElement() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        addAnyElement(jClass, element);

        ObjectUtils.assertSame("element", getAnyElement(jClass, annotatable));
    }

    @Test
    public void testAddAnyElementMultiple() {
        JAXBElement element1 = mock(JAXBElement.class);
        JAXBElement element2 = mock(JAXBElement.class);

        addAnyElement(jClass, element1);
        addAnyElement(jClass, element2);

        ObjectUtils.assertSame("element", getAnyElement(jClass, annotatable));
    }

    @Test
    public void testAddAnyElementWithCustomization() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        addAnyElement(jClass, element);

        ObjectUtils.assertSame("element", getAnyElement(jClass, annotatable));
    }

    @Test
    public void testSetAllAttributes() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        setAllAttributes(jClass, element);

        ObjectUtils.assertSame("element", getAnyElement(jClass, annotatable));
    }

    @Test
    public void testSetAllAttributesWithCustomization() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        setAllAttributes(jClass, element);

        ObjectUtils.assertSame("element", getAnyElement(jClass, annotatable));
    }

}