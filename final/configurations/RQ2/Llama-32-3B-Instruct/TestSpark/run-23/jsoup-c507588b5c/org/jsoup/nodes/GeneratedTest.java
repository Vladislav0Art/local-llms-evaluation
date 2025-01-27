package org.jsoup.nodes;

public class GeneratedTest {

    private String url;

    public TestJsoup(String url) {
        super();
        this.url = url;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[]{"https://www.example.com", "https://www.google.com"});
    }

    @Test
    public void createTextFromSingleChar() {
        String text = "a";
        TextNode node = new TextNode(text);
        assertEquals(1, node.text().length());
    }

    @Test
    public void createTextWithMultipleChars() {
        String text = "abc";
        TextNode node = new TextNode(text);
        assertEquals(3, node.text().length());
    }

    @Test
    public void nodeNameIsTextNode() {
        TextNode node = new TextNode("text");
        assertEquals("text_node", node.nodeName());
    }

    @Test
    public void textReturnsOriginalText() {
        String originalText = "text";
        TextNode node = new TextNode(originalText);
        assertEquals(originalText, node.text());
    }

    @Test
    public void textUpdatesNodeWithNewText() {
        TextNode node = new TextNode("old");
        node = node.text("new");
        assertEquals("new", node.text());
    }

    @Test
    public void isBlankReturnsTrueForEmptyText() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}