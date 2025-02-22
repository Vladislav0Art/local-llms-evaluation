package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some comment");
    }

    @Test
    public void testOuterHtmlHead() {
        StringWriter writer = new StringWriter();
        comment.outerHtmlHead(writer, 0, new Document.OutputSettings());
        assertEquals("<!--Some comment-->", writer.toString());
    }

}