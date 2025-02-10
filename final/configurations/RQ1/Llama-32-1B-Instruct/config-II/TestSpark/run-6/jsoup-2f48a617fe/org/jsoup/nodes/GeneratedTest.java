package org.jsoup.nodes;

public class GeneratedTest {

    private Document document;

    @Before
    public void setup() {
        // Initialize the document object for testing purposes
        String content = "This is a sample comment.";
        document = new Document(content, ParseSettings.PreserveCase);
    }

    @Test
    public void testCommentnodeName() {
        Comment comment = new Comment("#comment");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void testCommentDataGetters() {
        // Test the getData method to ensure it returns the expected value
        String data = "# This is a sample content.";
        Comment comment = new Comment(data);
        assertNotNull(comment.getData());
        assertEquals(data, comment.getData());
    }

    @Test
    public void testCommentsetDataAndGet() {
        // Test setting data using setData and verifying the update in getData
        Comment comment = new Comment("# This is a sample content.");
        comment.setData("New content");
        String updatedData = comment.getData();
        assertNotNull(updatedData);
        assertEquals("New content", updatedData);
    }

    @Test
    public void testCommentOuterHtmlHead() {
        // Test the outerHtmlHead method to ensure it appends the expected HTML tags and content
        Comment comment = new Comment("# This is a sample content.");
        append(comment.outerHtmlHead(document, 0, document OutputSettings()));
        assertEquals("<!--", getExpectedHtml());
    }

    @Test
    public void testCommentOuterHtmlTail() {
        // Test the outerHtmlTail method to ensure it does not modify the original output settings
        Comment comment = new Comment("# This is a sample content.");
        append(comment.outerHtmlTail(document, 0, documentOutputSettings()));
        assertEquals("This is a sample content.", getExpectedHtml());
    }

    @Test
    public void testCommentIsXmlDeclaration() {
        // Test the isXmlDeclaration method to ensure it returns true for the expected input
        String data = "# This is a sample XML declaration.";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

    private void append(String content) {
        document.append(content, ParseSettings.INDENT);
    }

    private String getExpectedHtml() {
        return "<!--" + document.body().content().toString() + "-->";
    }

}