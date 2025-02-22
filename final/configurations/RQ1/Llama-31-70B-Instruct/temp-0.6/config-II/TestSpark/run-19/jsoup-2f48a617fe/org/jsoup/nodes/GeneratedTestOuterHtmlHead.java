package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, new Document("").outputSettings());
        assertEquals("<!--comment-->", sb.toString());
    }

}