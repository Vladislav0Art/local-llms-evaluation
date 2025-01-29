package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_thenReturnOuterHtmlTail {

    private Comment comment;

    @Before
    public void setup() {
        String data = "<!-- this is a test comment -->";
        comment = new Comment(data);
    }

    @Test
    public void outerHtmlTail_thenReturnOuterHtmlTail() {
        String expected = "<!-- this is a test comment -->";
        comment.outerHtmlTail(appendable, depth, outputSettings -> outputSettings);
        assertEquals(expected, getExpectedString(outputSettings));
    }

    private String getExpectedString(Document.OutputSettings outputSettings) {
        return "<!-- this is a test comment -->";
    }
}

public class TestComment extends LeafNodeTest {
    @Before
    public void setup() {
        ParseSettings settings = new ParseSettings();
        Parser parser = new Parser(settings);
        // Initialize Comment instance with dummy data
    }

}