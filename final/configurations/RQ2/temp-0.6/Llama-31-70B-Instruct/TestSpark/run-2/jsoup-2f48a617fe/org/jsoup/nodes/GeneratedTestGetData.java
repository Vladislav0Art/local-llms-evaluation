package org.jsoup.nodes;

public class GeneratedTestGetData {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some comment");
    }

    @Test
    public void testGetData() {
        assertEquals("Some comment", comment.getData());
    }

}