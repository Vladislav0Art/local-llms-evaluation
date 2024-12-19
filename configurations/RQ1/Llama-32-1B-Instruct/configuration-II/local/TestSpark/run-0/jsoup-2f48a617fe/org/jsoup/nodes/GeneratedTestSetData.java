package org.jsoup.nodes;

public class GeneratedTestSetData {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a test comment -->");
    }

    @Test
    public void testSetData() {
        comment.setData("<!-- This is another test comment -->");
        assertEquals("This is another test comment", comment.getData());
    }

}