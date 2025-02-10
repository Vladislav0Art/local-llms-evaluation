package org.jsoup.nodes;

public class GeneratedTestCommentOuterHtmlTail {

    private Document document;

    @Before
    public void setup() {
        // Initialize the document object for testing purposes
        String content = "This is a sample comment.";
        document = new Document(content, ParseSettings.PreserveCase);
    }

    @Test
    public void testCommentOuterHtmlTail() {
        // Test the outerHtmlTail method to ensure it does not modify the original output settings
        Comment comment = new Comment("# This is a sample content.");
        append(comment.outerHtmlTail(document, 0, documentOutputSettings()));
        assertEquals("This is a sample content.", getExpectedHtml());
    }

}