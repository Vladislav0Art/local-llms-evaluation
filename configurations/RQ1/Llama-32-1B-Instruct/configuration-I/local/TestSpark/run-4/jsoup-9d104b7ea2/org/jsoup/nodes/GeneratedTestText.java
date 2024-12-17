package org.jsoup.nodes;

public class GeneratedTestText {

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
    public void testText() {
        assertEquals("", TextNodeImpl.getText());
        assertEquals("<p>Hello, World!</p>", TextNodeImpl.getText("Hello, World!"));
    }

}