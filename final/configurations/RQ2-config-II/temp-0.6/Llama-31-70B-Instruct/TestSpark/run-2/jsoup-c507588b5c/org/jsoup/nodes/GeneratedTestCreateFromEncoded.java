package org.jsoup.nodes;

public class GeneratedTestCreateFromEncoded {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode encodedTextNode = TextNode.createFromEncoded("&lt;");

        assertEquals("<", encodedTextNode.getWholeText());
    }

}