package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    public static Object getAnnotation(Object object) {
        return object;
    }

    public static String getPrivateField(Object object, String fieldName) {
        if (object == null || !object.getClass().hasMethod(fieldName)) {
            throw new NullPointerException();
        }
        try {
            return (String) ((MyClass) object).getAnnotation();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static class MyClass {
        private String annotation;

        public String getAnnotation() {
            return annotation;
        }
    }
}

public class XmlElementWrapperPluginTest {

    @Test
    public void testGetAnnotation() {
        Object object = new Object();
        assertNotNull(XmlElementWrapperPlugin.getAnnotation(object));
    }

    @Test
    public void testGetAnnotation_nullObject() {
        assertNull(XmlElementWrapperPlugin.getAnnotation(null));
    }

    @Test
    public void testGetPrivateField() {
        MyClass object = new MyClass();
        object.annotation = "privateFieldValue";
        assertEquals("privateFieldValue", XmlElementWrapperPlugin.getPrivateField(object, "getAnnotation"));
    }

    @Test
    public void testGetPrivateField_nullObject() {
        assertThrows(NullPointerException.class, () -> XmlElementWrapperPlugin.getPrivateField(null, "getAnnotation"));
    }

}