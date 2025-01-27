package org.jsoup.nodes;

public class GeneratedNewNode {

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
    public void newNode() {
        Comment comment = new Comment();
        assertNotNull(comment);
    }

}