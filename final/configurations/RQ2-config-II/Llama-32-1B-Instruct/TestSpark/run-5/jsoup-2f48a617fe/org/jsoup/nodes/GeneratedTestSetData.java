package org.jsoup.nodes;

public class GeneratedTestSetData {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testSetData() {
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}