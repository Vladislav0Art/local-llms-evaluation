package org.jsoup.nodes;

public class GeneratedTestToString {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testToString() {
        assertEquals("<!--comment-->", comment.toString());
    }

}