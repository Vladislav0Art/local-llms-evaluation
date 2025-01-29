package org.jsoup.nodes;

public class GeneratedGetData_thenReturnData {

    private Comment comment;

    @Before
    public void setup() {
        String data = "<!-- this is a test comment -->";
        comment = new Comment(data);
    }

    @Test
    public void getData_thenReturnData() {
        assertEquals("<!-- this is a test comment -->", comment.getData());
    }

}