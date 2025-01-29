package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    private MockParser parser;

    @Before
    public void setup() {
        parser = new MockParser();
    }

    public void testCommentNodeName() throws IOException {
        Document document = parseString("<!-- This is a comment -->");
        assertEquals(Comment.class, document.select("comment").first().nodeName());
    }

    public void testCommentData() throws IOException {
        Document document = parseString("<!-- This is a comment -->");
        assertEquals(6, document.select("comment").first().getData().length());
    }

    public void testCommentSetData() throws IOException {
        Document document = parseString("<!-- This is a comment -->");
        assertEquals(7, document.select("comment").first().setData("test").getData().length());
    }

    @Test
    public void testIsXmlDeclaration() {
        Document document = parseString("<!-- This is a comment -->");
        assertEquals(true, document.select("comment").first().isXmlDeclaration());
    }

}