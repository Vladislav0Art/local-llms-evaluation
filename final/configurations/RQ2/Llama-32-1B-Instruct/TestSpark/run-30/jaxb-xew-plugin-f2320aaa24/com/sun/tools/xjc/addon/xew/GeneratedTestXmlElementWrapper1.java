package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestXmlElementWrapper1 {

    @Test
    public void testXmlElementWrapper1() {
        JClassContainer container = createXjcContext().getContainer();

        // Test 1: Create a new XMLElement and add an annotation to it
        JAnnotatable annot = addAnnotation(container, "xew", "com.sun.tools.xjc.addon.xew");
        String xmlString = generateXsdDeclaration(annot);
        JElement element = container.createJElement(xmlString);
        element.setClass(new QName("example", "example"));
        element.setXmlType(XSType.XSD SimpleTypeType);

        // Test 2: Get the annotation value from an instance of the class
        String annotValue = getAnnotationMemberValue(annot, "xew");
        System.out.println(annotValue);

        // Test 3: Create a new XMLElement and add two annotations to it
        JAnnotatable annot1 = addAnnotation(container, "xew", "com.sun.tools.xjc.addon.xew");
        String xmlString2 = generateXsdDeclaration(annot1);
        JElement element1 = container.createJElement(xmlString2);
        element1.setClass(new QName("example", "example"));
        element1.setXmlType(XSType.XSD SimpleTypeType);

        JAnnotatable annot2 = addAnnotation(container, "xew", "com.sun.tools.xjc.addon.xew");
        String xmlString3 = generateXsdDeclaration(annot2);
        JElement element2 = container.createJElement(xmlString3);
        element2.setClass(new QName("example", "example"));
        element2.setXmlType(XSType.XSD SimpleTypeType);

        // Test 4: Get the annotations from an instance of the class
        String[] annots = getAnnotationMembers(annot1, "xew");
        for (String annotation : annots) {
            System.out.println(annotation);
        }

        // Test 5: Create a new XMLElement with an annotation that has a custom name property
        JAnnotatable annot3 = addAnnotation(container, "xew", "com.sun.tools.xjc.addon.xew");
        annot3.setNameProperty(new StringPropertyInfo("example", "CustomName"));
        String xmlString4 = generateXsdDeclaration(annot3);
        JElement element3 = container.createJElement(xmlString4);

        // Test 6: Get the custom name property from an instance of the class
        CustomPropertyInformation customProperty = getAnnotationMemberValue(annot3, "xew");
        System.out.println(customProperty.getPropertyName());

    }

    private static String generateXsdDeclaration(JAnnotatable annot) throws ClassNotFoundException, IOException {
        JAXBElement element = (JAXBElement<?>) getAnnot().getAnnotation(JavaBeansXMLConstants.JAXBEANS_XSD_ELEMENT_TYPE).getBody();
        return "<xs:schema xmlns:xs=\"" + getSchemaNamespace() + "\"><xs:element name=\"" + getAnnot().getName().toLowerCase() + "\">"
                + getAnnot().getSimpleName() + "</xs:element></xs:schema>";
    }

    private static String getAnnot(String namespace) {
        return "com.sun.tools.xjc.addon.xew." + namespace;
    }

    private static String getSchemaNamespace() {
        return "http://example.com/schemas/";
    }

}