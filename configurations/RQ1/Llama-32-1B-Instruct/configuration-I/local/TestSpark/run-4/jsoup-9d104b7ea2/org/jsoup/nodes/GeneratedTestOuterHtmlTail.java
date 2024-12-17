package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

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
    public void testOuterHtmlTail() {
        Document doc = MockDocument.create();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = Document.OutputSettings.INDENT_NO_NEWLINE;

        // When the method is called without a tail node
        outerHtmlTailTest(accum.toString(), doc, out);

        // Then the result should have been cleared
        assertEquals("Hello\nWorld!", accum.toString());
    }

}