package org.jsoup.nodes;

public class GeneratedTestClone {

    private MockParser parser;

    @Before
    public void setup() {
        parser = new MockParser();
    }

    public void testCommentNodeName() throws IOException {
        Document document = parseString("<!-- This is a comment -->");
        assertEquals(Comment.class, document.select("comment").first().nodeName());
    }

    public void testCommentData() throws IOException {
        Document document = parseString("<!-- This is a comment -->");
        assertEquals(6, document.select("comment").first().getData().length());
    }

    public void testCommentSetData() throws IOException {
        Document document = parseString("<!-- This is a comment -->");
        assertEquals(7, document.select("comment").first().setData("test").getData().length());
    }

    @Test
    public void testClone() {
        String data1 = "<!-- This is a comment -->";
        String data2 = "<!-- This is another comment -->";
        Comment comment1 = new Comment(data1);
        Comment comment2 = comment1.clone();
        assertEquals(comment1, comment2);
    }

}