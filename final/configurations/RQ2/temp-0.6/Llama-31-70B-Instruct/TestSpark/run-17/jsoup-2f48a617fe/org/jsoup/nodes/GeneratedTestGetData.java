package org.jsoup.nodes;

public class GeneratedTestGetData {

    private Comment comment;
    private String data;

    @Before
    public void setUp() {
        data = "This is a test.";
        comment = new Comment(data);
    }

    @Test
    public void testGetData() {
        assertEquals(data, comment.getData());
    }

}