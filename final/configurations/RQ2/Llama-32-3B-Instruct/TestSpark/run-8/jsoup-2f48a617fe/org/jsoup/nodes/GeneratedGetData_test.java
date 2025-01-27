package org.jsoup.nodes;

public class GeneratedGetData_test {

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
    public void getData_test() {
        Comment comment = new Comment();
        assertEquals("", comment.getData());
    }

}