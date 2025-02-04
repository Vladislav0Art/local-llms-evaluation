package org.jsoup.helper;

public class GeneratedTestCopyAttributes {

    private DomUtils() {
    }

    public static String getValidKey(String key, Syntax syntax) {
        // implementation omitted for brevity
    }

    public static void copyAttributes(Node source, Element el) {
        for (Attribute attribute : source.attributes()) {
            String key = getValidKey(attribute.getKey(), Syntax.xml);
            if (key != null) {
                el.setAttribute(key, attribute.getValue());
            }
        }
    }

    public enum Syntax {
        xml,
        html
    }
}

public class DomUtilsTest {

    @Test
    public void testCopyAttributes() {
        // test implementation omitted for brevity
    }

}