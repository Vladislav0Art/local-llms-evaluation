package org.jsoup.nodes;

public class GeneratedTestGetData {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a test comment -->");
    }

    @Test
    public void testGetData() {
        assertEquals("This is a test comment", comment.getData());
    }

}