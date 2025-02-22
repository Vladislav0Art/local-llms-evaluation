package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some comment");
    }

    @Test
    public void testOuterHtmlTail() {
        StringWriter writer = new StringWriter();
        comment.outerHtmlTail(writer, 0, new Document.OutputSettings());
        assertEquals("", writer.toString());
    }

}