package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void testGetAnnotation() {
        JAnnotatable annotatable = CommonUtils.getAnnotation(XmlElementWrapper.class);
        assertNotNull(annotatable);
    }

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annotatable = CommonUtils.copyAnnotationMemberValue(XmlElementWrapper.class, "attr");
        assertNotNull(annotatable);
    }

    @Test
    public void testCopyFields() {
        JClass clazz = CommonUtils.getJClass(XmlElementWrapper.class);
        List<JFieldVar> fields = CommonUtils.getFields(clazz);
        assertNotNull(fields);
        for (JFieldVar field : fields) {
            assertNotNull(field.getName());
        }
    }

    @Test
    public void testGenerateXsdDeclaration() {
        JAnnotatable annotatable = XmlElementWrapper.class;
        String xsdDeclaration = CommonUtils.getXsdDeclaration(annotatable, "xs:element", "xi:", true);
        assertNotNull(xsdDeclaration);
    }

    @Test
    public void testGetPrivateField() {
        JClass clazz = CommonUtils.getJClass(XmlElementWrapper.class);
        Object privateField = null;
        assertNull(CommonUtils.getPrivateField(clazz, "privateField"));
    }

    @Test
    public void testHasPropertyCustomization() {
        CCustomizations properties = new CCustomizations();
        properties.setProperty("attr", true);
        String xmlString = CommonUtils.generableToString(properties);
        assertNotNull(xmlString);
        assertEquals("<xs:element name=\"attr\" xsd:type=\"xs:string\" xsd:default-value=\"\"/>", xmlString);
    }

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annotatable = XmlElementWrapper.class;
        QName qname = new QName("http://example.com", "attribute");
        String value = CommonUtils.getAnnotationMemberValue(annotatable, qname);
        assertNotNull(value);
    }

    @Test
    public void testGetPrivateField() {
        JClass clazz = CommonUtils.getJClass(XmlElementWrapper.class);
        Object privateField = null;
        assertNotNull(CommonUtils.getPrivateField(clazz, "privateField"));
    }

    @Test
    public void testGetXsdDeclaration() {
        JAnnotatable annotatable = XmlElementWrapper.class;
        String xsdDeclaration = null;
        assertNotNull(CommonUtils.getXsdDeclaration(annotatable));
    }

}