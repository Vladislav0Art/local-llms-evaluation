package org.jsoup.nodes;

public class GeneratedTest {

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
    public void testOuterHtmlHead() {
        String data = "<!-- This is a comment -->";
        Comment comment = new Comment(data);
        Appendable accum = new StringReader("");
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, 1, out);
        assertEquals("<!-- This is a comment -->", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        String data = "<!-- This is a comment -->";
        Comment comment = new Comment(data);
        Appendable accum = new StringReader("");
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, 1, out);
        assertEquals("<!-- This is a comment -->", accum.toString());
    }

    public void testToString() throws IOException {
        Document document = parseString("<!-- This is a comment -->");
        assertEquals("Comment", new Comment(document).toString().trim());
    }

    @Test
    public void testClone() {
        String data1 = "<!-- This is a comment -->";
        String data2 = "<!-- This is another comment -->";
        Comment comment1 = new Comment(data1);
        Comment comment2 = comment1.clone();
        assertEquals(comment1, comment2);
    }

    @Test
    public void testIsXmlDeclaration() {
        Document document = parseString("<!-- This is a comment -->");
        assertEquals(true, document.select("comment").first().isXmlDeclaration());
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