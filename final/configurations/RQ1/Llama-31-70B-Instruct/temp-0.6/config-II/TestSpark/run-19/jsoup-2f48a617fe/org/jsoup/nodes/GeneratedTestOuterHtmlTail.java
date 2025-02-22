package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlTail(sb, 0, new Document("").outputSettings());
        assertEquals("", sb.toString());
    }

}