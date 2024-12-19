package org.jsoup.nodes;

public class GeneratedCreateCommentWithData {

    @Test
    public void createCommentWithData() {
        // given:
        String data = "Hello, World!";
        Comment comment = new Comment(data);

        // when:
        assert comment.getData().equals(data);
        assert comment.nodeName().equals("#comment");
    }

}