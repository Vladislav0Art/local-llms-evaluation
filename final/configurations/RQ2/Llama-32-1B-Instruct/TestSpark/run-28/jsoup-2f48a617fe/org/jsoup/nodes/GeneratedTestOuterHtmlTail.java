package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

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

}