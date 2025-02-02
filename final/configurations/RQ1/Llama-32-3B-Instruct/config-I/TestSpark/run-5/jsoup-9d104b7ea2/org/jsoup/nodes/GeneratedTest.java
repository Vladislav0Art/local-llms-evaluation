package org.jsoup.nodes;

public class GeneratedTest {

    public String nodeName() {
        return "#text";
    }

    public boolean isBlank() {
        return false;
    }

    public void setText(String newText) {
    }
}

public class TextNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getWholeText() {
        return text;
    }
}

public class GeneratedTest {

    @Mock
    public LeafNode getMockLeafNode() {
        return new LeafNode();
    }

    @Before
    public void setup() throws IOException {
        TextNode parentNode = new TextNode("");
    }

    @Test
    public void newTextNode_emptyText_test() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
        assertTrue(textNode.isBlank());
    }

    @Test
    public void newTextNode_singleCharacter_text_test() {
        String text = "a";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
        assertFalse(textNode.isBlank());
    }

    @Test
    public void newTextNode_multipleCharacters_text_test() {
        String text = "hello";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
        assertFalse(textNode.isBlank());
    }

    @Test
    public void text_nodeText_returnsUnencodedText_test() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello, World!", textNode.text());
    }

    @Test
    public void text_setText_setsNewText_test() {
        String newText = "Foo Bar";
        TextNode textNode = new TextNode("");
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

    @Test
    public void text_nodeWholeText_returnsUnencodedText_withSpaces_and_newlines_test() {
        String text = "Hello,\nWorld!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello,\nWorld!", textNode.getWholeText());
    }

    @Test
    public void text_nodeIsBlank_returnsTrue_ifOnlyWhitespace_isPresent_test() {
        String text = "\t";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void text_nodeIsBlank_returnsFalse_ifNonWhitespace_content_isPresent_test() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}