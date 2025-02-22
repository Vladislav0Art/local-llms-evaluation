package org.jsoup.nodes;

public class GeneratedToString_ShouldReturnOuterHtml {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("testData");
    }

    @Test
    public void toString_ShouldReturnOuterHtml() {
        assertEquals("<!---->", comment.toString());
    }

}