package org.jsoup.nodes;

public class GeneratedTestToString {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a test comment -->");
    }

    @Test
    public void testToString() {
        String expected = "<!-- This is a test comment -->";
        assertEquals(expected, comment.toString());
    }

}