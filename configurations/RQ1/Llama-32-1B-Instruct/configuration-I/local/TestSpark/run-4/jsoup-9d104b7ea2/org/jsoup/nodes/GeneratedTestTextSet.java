package org.jsoup.nodes;

public class GeneratedTestTextSet {

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
    public void testTextSet() {
        TextNodeImpl text = new TextNodeImpl("   Hello");
        assertEquals("<p>Hello</p>", text.getText());
    }

}