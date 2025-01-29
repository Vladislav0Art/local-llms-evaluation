package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetPrivateField {

    private static final String XML_ELEMENT_NAME = "element";

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