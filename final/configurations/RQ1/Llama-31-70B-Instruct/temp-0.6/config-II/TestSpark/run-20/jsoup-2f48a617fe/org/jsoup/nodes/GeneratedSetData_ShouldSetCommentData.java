package org.jsoup.nodes;

public class GeneratedSetData_ShouldSetCommentData {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("testData");
    }

    @Test
    public void setData_ShouldSetCommentData() {
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

}