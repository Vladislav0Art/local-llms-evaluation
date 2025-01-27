package org.jsoup.nodes;

public class GeneratedToString_test {

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
    public void toString_test() {
        Comment comment = new Comment();
        comment.setData("data");
        assertEquals("data", comment.toString());
    }

}