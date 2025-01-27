package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementWrapperPlugin {

    @Test
    public void testXmlElementWrapperPlugin() {
        String clazzName = "com.example.XmlElementWrapperPlugin";
        assertTrue(clazzName.endsWith("XmlElementWrapperPlugin"));

        Class<?> clazz = Class.forName(clazzName);
        assertEquals(0, clazz.getMethods().length);

        XmlElementWrapper annotation = (XmlElementWrapper) clazz.getAnnotation(XmlElementWrapper.class);
    }

    public class XmlElementWrapper {
        @Retention(RetentionPolicy.RUNTIME)
        @Target(ElementType.TYPE)
        public @interface XmlElementWrapper {
            // Add fields and methods as needed
        }
    }
}

}