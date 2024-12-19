package org.jsoup.nodes;

public class GeneratedSetNodeNameIsComment {

    @Test
    public void setNodeNameIsComment() {
        // given:
        Comment comment = new Comment("Hello, World!");

        // when:
        String nodeName = comment.nodeName();
        assertEquals("#comment", nodeName);
    }

}