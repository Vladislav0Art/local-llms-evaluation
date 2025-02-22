package org.jsoup.nodes;

public class GeneratedTestSetData {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testSetData() {
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

}