package org.jsoup.nodes;

public class GeneratedEqualsTest {

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
    public void equalsTest() {
        Comment comment1 = new Comment();
        Comment comment2 = new Comment();
        Comment comment3 = new Comment();

        assertTrue(comment1.equals(comment2));
        assertFalse(comment1.equals(comment3));
    }

}