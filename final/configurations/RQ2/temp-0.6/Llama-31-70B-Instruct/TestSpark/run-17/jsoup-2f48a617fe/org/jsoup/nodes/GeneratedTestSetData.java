package org.jsoup.nodes;

public class GeneratedTestSetData {

    private Comment comment;
    private String data;

    @Before
    public void setUp() {
        data = "This is a test.";
        comment = new Comment(data);
    }

    @Test
    public void testSetData() {
        String newData = "New data.";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}