package org.jsoup.nodes;

public class GeneratedTestJsoupHasAttributeMultipleWithNull {

    @Test
    public void testJsoupHasAttributeMultipleWithNull() {
        String attrName = "test";
        boolean hasAttr = Jsoup.parse("<p>Hello, World!</p>", "", new TagFactory(false), new Attributes()).hasAttr(attrName);
        assertFalse(hasAttr);
    }
}

class TagFactory {
    private static final Class<?> TAG_TYPE = Tag.class;

    public static Tag factory(boolean isHTMLElement) {
        return new Tag(isHTMLElement ? new HTMLElement() : Tag.class);
    }

    public static String getTagContent(Tag tag) {
        switch (tag.getType()) {
            case HTML_TAG_ELEMENT:
                return tag.getName();
            default:
                throw new RuntimeException("Unsupported tag type");
        }
    }

    public static boolean hasAttr(String attrName, String value) {
        return Jsoup.parse("<p>Hello, World!</p>", "", TagFactory.class, Arrays.asList(new Attributes().withAttr(attrName, value))).hasAttr(attrName);
    }

    public static boolean hasAttr(String attrName) {
        return Jsoup.parse("<p>Hello, World!</p>", "", TagFactory.class, new Attributes()).hasAttr(attrName);
    }
}

class Attributes extends AbstractMap<String, String> {
    @Override
    protected Object get(Object key) {
        switch (key.getClass()) {
            case String:
                return key.toString();
            default:
                throw new RuntimeException("Unsupported attribute type");
        }
    }

    public static Attributes withAttr(String attrName, String value) {
        try {
            return new Attributes().put(attrName, value);
        } catch (NullPointerException e) {
            throw new RuntimeException("Attribute name is empty", e);
        }
    }
}

class HTMLElement extends AbstractMap<String, Object> {
    @Override
    protected Object get(Object key) {
        switch (key.getClass()) {
            case String:
                return key.toString();
            default:
                throw new RuntimeException("Unsupported attribute type");
        }
    }

    public static HTMLElement withAttr(String attrName, Object value) {
        try {
            return new HTMLElement().put(attrName, value);
        } catch (NullPointerException e) {
            throw new RuntimeException("Attribute name is empty", e);
        }
    }

}