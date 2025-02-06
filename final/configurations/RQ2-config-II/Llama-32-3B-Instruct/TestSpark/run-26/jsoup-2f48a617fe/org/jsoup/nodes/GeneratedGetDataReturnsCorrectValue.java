package org.jsoup.nodes;

public class GeneratedGetDataReturnsCorrectValue {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void getDataReturnsCorrectValue() {
        String expectedData = "data";
        assertEquals(expectedData, comment.getData());
    }

}