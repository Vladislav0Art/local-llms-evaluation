package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private final String value;

    public TextNodeImpl(String text) {
        super(text);
        this.value = StringUtil.normaliseWhitespace(getWholeText());
    }

    @Override
    public String nodeName() {
        return "#text";
    }
}

public class TextNodeTests {

    @Test
    public void testIsBlank() {
        assertFalse(TextNodeImpl.isBlank("   "));
        assertFalse(TextNodeImpl.isBlank(""));
        assertFalse(TextNodeImpl.isBlank(null));
    }

}