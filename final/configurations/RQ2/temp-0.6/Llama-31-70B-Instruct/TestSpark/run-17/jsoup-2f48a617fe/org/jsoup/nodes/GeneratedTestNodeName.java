package org.jsoup.nodes;

public class GeneratedTestNodeName {

    private Comment comment;
    private String data;

    @Before
    public void setUp() {
        data = "This is a test.";
        comment = new Comment(data);
    }

    @Test
    public void testNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

}