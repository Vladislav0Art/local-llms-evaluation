package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation_nullObject {

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
    public void testGetAnnotation_nullObject() {
        assertNull(XmlElementWrapperPlugin.getAnnotation(null));
    }

}