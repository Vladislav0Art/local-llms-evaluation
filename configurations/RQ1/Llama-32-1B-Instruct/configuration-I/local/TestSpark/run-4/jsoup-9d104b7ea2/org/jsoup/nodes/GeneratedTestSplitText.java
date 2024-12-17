package org.jsoup.nodes;

public class GeneratedTestSplitText {

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
    public void testSplitText() {
        String originalText = "<hello world";
        TextNodeImpl text1 = new TextNodeImpl(originalText.substring(0, 2));
        TextNodeImpl text2 = new TextNodeImpl(originalText.substring(5));

        TextNodeImpl result = TextNode.text(text1).splitText(3);
        assertEquals("Hello", result.getText());
    }

}