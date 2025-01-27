package org.jsoup.nodes;

public class GeneratedTestCommentGetDataReturnsCorrectDataAndIsNotNull {

    private String data;
    private String nodeName;

    public Comment(String data) {
        this.data = data;
        this.nodeName = "Comment";
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    public XmlDeclaration asXmlDeclaration() {
        return null;
    }
}

public class XmlDeclaration {
    // fields and methods for XmlDeclaration
}

public class CommentTest {

    private static final String TEST_DATA = "test data";

    @Test
    public void testCommentGetDataReturnsCorrectDataAndIsNotNull() {
        Comment comment = new Comment(TEST_DATA);
        String data = comment.getData();
        assertNotNull(data);
        assertEquals(TEST_DATA, data);
    }

}