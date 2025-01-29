package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    private static final String XML_ELEMENT_NAME = "element";

    @Test
    public void testGetAnnotation() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        assertEquals(XML_ELEMENT_NAME, getAnnotation(annotation).getName());
    }

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        String propertyName = "propertyName";
        Object value = getAnnotationMemberValue(annotation, propertyName);
        assertEquals(propertyName, (String) value);
    }

    @Test
    public void testCopyFields() {
        JClass classObject = getMock(JClass.class);
        CopyFields copyFields = new CopyFields();
        copyFields.copy(classObject);
        ClassOutline outline = getMock(ClassOutline.class);

        // Test copying fields of a single field or method
        JFieldVar fieldVar = classObject.getMember("field");
        assertEquals(0, outline.getFieldCount());
        assertEquals("field", XML_ELEMENT_NAME + ":" + fieldVar.getName());
        assertEquals("get", fieldVar.getAnnotation(XMLElementWrapperPlugin.class).getName());

        // Test copying fields of multiple fields or methods
        JMethod method = classObject.getMethod("method");
        JFieldVar fieldVar1 = classObject.getMember("field1");
        JFieldVar fieldVar2 = classObject.getMember("field2");
        assertEquals(0, outline.getFieldCount());
        assertEquals(XML_ELEMENT_NAME + ":" + fieldVar1.getName() + "|" + XML_ELEMENT_NAME + ":" + fieldVar2.getName(), outline.getFieldName());
    }

    @Test
    public void testGenerableToString() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        String propertyName = "propertyName";
        Object value = generableToString(annotation, propertyName);
        assertEquals(propertyName, (String) value);
    }

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        CopyAnnotationMemberValue copyAnnotationMemberValue = new CopyAnnotationMemberValue();
        copyAnnotationMemberValue.copy(annotation);
        Object value = getAnnotationMemberValue(annotation, "propertyName");
        assertEquals("propertyName", (String) value);
    }

    @Test
    public void testIsHiddenClass() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        setPrivateField(annotation, "hiddenClass");
        assertTrue(isHiddenClass(annotation));
        clearHiddenClass(annotation);
    }

    @Test
    public void testGetXmlSchema() {
        JAXBElement element = getMock(JAXBElement.class);
        QName qname = getMock(QName.class);
        String schema = generableToString(element, qname);
        assertEquals("schema", "schema");
    }

    @Test
    public void testIsListedAsParametrisation() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        setPrivateField(annotation, "is Listed As Parmetisation");
        assertTrue(isListedAsParametrisation(annotation));
        clearIs Listed AsParmetisation(annotation);
    }

    @Test
    public void testSetPrivateField() {
        JClass classObject = getMock(JClass.class);
        setPrivateField(classObject, "private field", "value");
        assertEquals("private field", getPrivateField(classObject).getName());
        assertEquals("value", getPrivateField(classObject).getValue().toString());
    }

    private static class MockJAnnotatable implements JAnnotatable {
        public String getName() {
            return XML_ELEMENT_NAME;
        }

        public Object getAnnotation() {
            return null;
        }

        @Override
        public void copy(JClass container) {
        }
    }

    private static class MockJAnnotatableArray implements JAnnotatable[]

    {
        public String[] getAnnotations () {
        return new String[0];
    }

        @Override
        public void copy (JClass container){
    }

        @Override
        public void setPrivateField (String name, Object value){
    }
    }

    private static class MockJAnnotatableList implements JAnnotatable[]

    {
        public JAnnotatable[] getAnnotations () {
        return new JAnnotatable[0];
    }

        @Override
        public void copy (JClass container){
    }

        @Override
        public void setPrivateField (String name, Object value){
    }
    }

    private static class MockJAnnotatableMap implements JAnnotatableMap {
        public String[] getAnnotations() {
            return new String[0];
        }

        @Override
        public void copy(JClass container) {
        }

        @Override
        public void setPrivateField(String name, Object value) {
        }
    }

    private static class MockJAnnotationArrayMember implements JAnnotationArrayMember {
        public JAnnotatable[] getAnnotations() {
            return new String[0];
        }
    }

    private static class MockJAnnotationUse implements JAnnotationUse {
        @Override
        public JAnnotatable getValue(JClass container) {
        }

        @Override
        public void setValue(JClass container, JAnnotatable value) {
        }
    }

    private static class MockJMethod extends JMethod {
    }

}