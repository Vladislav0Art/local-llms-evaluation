package org.jsoup.nodes;

public class GeneratedSetData_thenReturnComment {

    private Comment comment;

    @Before
    public void setup() {
        String data = "<!-- this is a test comment -->";
        comment = new Comment(data);
    }

    @Test
    public void setData_thenReturnComment() {
        comment.setData("");
        assertEquals("", comment.getData());
    }

}