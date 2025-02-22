package org.jsoup.nodes;

public class GeneratedTestToString {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some comment");
    }

    @Test
    public void testToString() {
        assertEquals("<!--Some comment-->", comment.toString());
    }

}