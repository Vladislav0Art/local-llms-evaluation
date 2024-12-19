package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a test comment -->");
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, null);
        assertTrue(accum.toString().contains("<!-- This is a test comment -->"));
        assertEquals(comment.nodeName(), "comment");
    }

}