package org.jsoup.nodes;

public class GeneratedTest {

    private Document document;
    private ParseSettings parseSettings;

    @Test
    public void testnodeName() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void testsetData() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        document = new Document();
        parseSettings = document.getParseSettings();
        appendComment(comment, 0, 1, parseSettings);
        assertEquals("<!-- comment --><br>", comment.outerHtmlHead(document, 0, parseSettings));
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        document = new Document();
        parseSettings = document.getParseSettings();
        appendComment(comment, 1, 3, parseSettings);
        assertEquals("<br><!-- comment --><br>", comment.outerHtmlTail(document, 1, parseSettings));
    }

    @Test
    public void testToString() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals("<!-- comment -->", comment.toString());
    }

    @Test
    public void testClone() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

}