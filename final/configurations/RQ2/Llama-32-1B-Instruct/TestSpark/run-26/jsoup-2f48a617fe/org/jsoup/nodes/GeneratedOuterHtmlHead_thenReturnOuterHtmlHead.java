package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_thenReturnOuterHtmlHead {

    private Comment comment;

    @Before
    public void setup() {
        String data = "<!-- this is a test comment -->";
        comment = new Comment(data);
    }

    @Test
    public void outerHtmlHead_thenReturnOuterHtmlHead() {
        String expected = "<!-- this is a test comment -->";
        comment.outerHtmlHead(appendable, depth, outputSettings -> outputSettings);
        assertEquals(expected, getExpectedString(outputSettings));
    }

}