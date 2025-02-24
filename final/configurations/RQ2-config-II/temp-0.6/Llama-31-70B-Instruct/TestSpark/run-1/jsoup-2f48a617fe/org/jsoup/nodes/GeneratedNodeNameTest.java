package org.jsoup.nodes;

public class GeneratedNodeNameTest {

    private Comment comment;

    @Test
    public void nodeNameTest() {
        comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

}