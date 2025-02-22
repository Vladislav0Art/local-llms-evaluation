package org.jsoup.nodes;

public class GeneratedTestGetData {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testGetData() {
        assertEquals("comment", comment.getData());
    }

}