package org.jsoup.nodes;

public class GeneratedTestCommentNodeName {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a test comment -->");
    }

    @Test
    public void testCommentNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

}