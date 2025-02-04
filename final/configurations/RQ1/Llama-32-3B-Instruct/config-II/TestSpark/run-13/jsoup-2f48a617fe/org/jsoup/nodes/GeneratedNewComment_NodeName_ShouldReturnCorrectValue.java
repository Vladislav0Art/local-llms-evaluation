package org.jsoup.nodes;

public class GeneratedNewComment_NodeName_ShouldReturnCorrectValue {

    @Test
    public void newComment_NodeName_ShouldReturnCorrectValue() {
        // given
        String data = "some comment";
        Comment comment = new Comment(data);

        // when
        String nodeName = comment.nodeName();

        // then
        assertEquals("#comment", nodeName);
    }

}