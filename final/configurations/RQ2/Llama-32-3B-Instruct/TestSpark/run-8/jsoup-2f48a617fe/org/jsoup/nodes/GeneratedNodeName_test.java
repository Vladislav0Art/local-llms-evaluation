package org.jsoup.nodes;

public class GeneratedNodeName_test {

    private String data;

    public Comment() {
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

public class GeneratedTest {

    @Test
    public void nodeName_test() {
        Comment comment = new Comment();
        assertEquals(Comment.tag, comment.nodeName());
    }

}