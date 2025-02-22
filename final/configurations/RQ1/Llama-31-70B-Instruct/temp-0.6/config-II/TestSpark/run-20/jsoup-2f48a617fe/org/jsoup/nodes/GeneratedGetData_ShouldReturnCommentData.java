package org.jsoup.nodes;

public class GeneratedGetData_ShouldReturnCommentData {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("testData");
    }

    @Test
    public void getData_ShouldReturnCommentData() {
        String data = comment.getData();
        assertEquals("testData", data);
    }

}