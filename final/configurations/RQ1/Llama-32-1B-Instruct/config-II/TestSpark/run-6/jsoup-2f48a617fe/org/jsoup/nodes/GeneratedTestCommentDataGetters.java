package org.jsoup.nodes;

public class GeneratedTestCommentDataGetters {

    private Document document;

    @Before
    public void setup() {
        // Initialize the document object for testing purposes
        String content = "This is a sample comment.";
        document = new Document(content, ParseSettings.PreserveCase);
    }

    @Test
    public void testCommentDataGetters() {
        // Test the getData method to ensure it returns the expected value
        String data = "# This is a sample content.";
        Comment comment = new Comment(data);
        assertNotNull(comment.getData());
        assertEquals(data, comment.getData());
    }

}