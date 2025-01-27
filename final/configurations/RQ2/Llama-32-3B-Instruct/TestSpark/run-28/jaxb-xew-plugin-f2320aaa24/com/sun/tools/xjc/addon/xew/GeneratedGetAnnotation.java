package com.sun.tools.xjc.addon.xew;

public class GeneratedGetAnnotation {

    private ArrayList<Object> elements = new ArrayList<>();

    public void addElement(String element) {
        elements.add(element);
    }

    public boolean hasElements() {
        return !elements.isEmpty();
    }
}

public class XmlElementWrapperPlugin {
    public String runInternal(Outline outline) throws IOException {
        // Implementation depends on the class
        return "XML Element Wrapper";
    }

    public static class Annotation {
        private String name;

        public Annotation(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface XmlElementWrapper {
        String name();
    }
}

public class XmlElementWrapperPluginTest {

    @Test
    public void getAnnotation() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Class<?> clazz = plugin.getClass();
        Annotation annotation = (Annotation) clazz.getAnnotation(XmlElementWrapper.class);
        assertEquals(annotation.getName(), "test");
    }

}