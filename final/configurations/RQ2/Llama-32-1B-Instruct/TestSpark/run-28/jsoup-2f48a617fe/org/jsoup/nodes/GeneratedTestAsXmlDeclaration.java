package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

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
    public void testAsXmlDeclaration() throws IOException {
        Document document = parseString("<xml><data>test</data></xml>");
        Comment comment = new Comment(document.asXmlDeclaration());
        assertEquals(Comment.class, comment.constructor);
        assertEquals("test", comment.getData().trim());
    }
}

class MockParser extends Parser {
    @Override
    public String[] parse(String data) throws IOException {
        return new String[]{data};
    }

    @Override
    public String asXmlDeclaration() throws IOException {
        return "";
    }

}