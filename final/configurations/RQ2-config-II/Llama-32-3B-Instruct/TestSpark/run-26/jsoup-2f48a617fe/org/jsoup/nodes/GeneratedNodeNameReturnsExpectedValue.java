package org.jsoup.nodes;

public class GeneratedNodeNameReturnsExpectedValue {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void nodeNameReturnsExpectedValue() {
        String expectedNodeName = "comment";
        assertEquals(expectedNodeName, comment.nodeName());
    }

}