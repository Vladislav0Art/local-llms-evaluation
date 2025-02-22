package org.jsoup.nodes;

public class GeneratedTestSetData {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some comment");
    }

    @Test
    public void testSetData() {
        comment.setData("New comment");
        assertEquals("New comment", comment.getData());
    }

}