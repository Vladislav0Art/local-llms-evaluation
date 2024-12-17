package org.jsoup.nodes;

public class GeneratedCreateTextNode_CreateTextNode {

    private Document document;
    private TextNode textNode;

    @Before
    public void setup() {
        document = new Document();
        textNode = new TextNode("Hello World");
        textNode.parentNode = document;
    }

    public static String stripLeadingWhitespace(String text) {
        return StringUtil.stripLeadingWhitespace(text);
    }

    public static String normalizeWhitespace(String text) {
        return StringUtil.normalizeWhitespace(text);
    }

    public static String escapeEntities(String text, Document.OutputSettings outputSettings) {
        return Entities.escape(text, outputSettings, false);
    }

    @Test
    public void createTextNode_CreateTextNode() {
        TextNode createdTextNode = new TextNode("Hello World");
        assertNotNull(createdTextNode);
    }

}