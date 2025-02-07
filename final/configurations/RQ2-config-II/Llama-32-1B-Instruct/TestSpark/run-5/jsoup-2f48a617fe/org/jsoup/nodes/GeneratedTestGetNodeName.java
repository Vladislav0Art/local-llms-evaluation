package org.jsoup.nodes;

public class GeneratedTestGetNodeName {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testGetNodeName() {
        assertEquals("Comment", comment.nodeName());
    }

}