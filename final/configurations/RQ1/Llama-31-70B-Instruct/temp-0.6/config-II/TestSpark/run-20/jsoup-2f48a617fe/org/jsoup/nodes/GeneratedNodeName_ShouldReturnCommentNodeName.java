package org.jsoup.nodes;

public class GeneratedNodeName_ShouldReturnCommentNodeName {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("testData");
    }

    @Test
    public void nodeName_ShouldReturnCommentNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

}