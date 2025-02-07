package org.jsoup.nodes;

public class GeneratedTestGetData {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testGetData() {
        assertEquals("This is a comment ", comment.getData());
    }

}