package org.jsoup.nodes;

public class GeneratedSetDataSetsCorrectData {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void setDataSetsCorrectData() {
        String newData = "new data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}