package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

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
    public void testOuterHtmlHead() {
        // Given a document with a root element
        Document doc = MockDocument.create();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = Document.OutputSettings.INDENT_NO_NEWLINE;

        TextNodeImpl node = new TextNodeImpl("<p>Hello, World!</p>");
        node.outerHtmlHead(accum, depth, out);

        // When the method is called
        outerHtmlHeadTest(accum.toString(), doc, out);

        // Then the result should have been indented correctly
        assertEquals("Hello\nWorld!", accum.toString());
    }

}