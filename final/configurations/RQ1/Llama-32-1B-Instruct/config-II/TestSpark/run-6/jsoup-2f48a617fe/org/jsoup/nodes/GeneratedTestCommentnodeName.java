package org.jsoup.nodes;

public class GeneratedTestCommentnodeName {

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

}