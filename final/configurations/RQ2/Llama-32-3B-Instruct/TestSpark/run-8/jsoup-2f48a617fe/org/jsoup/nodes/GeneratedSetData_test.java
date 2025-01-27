package org.jsoup.nodes;

public class GeneratedSetData_test {

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
    public void setData_test() {
        Comment comment = new Comment();
        comment.setData("");
        assertEquals("", comment.getData());
    }

}