package org.jsoup.nodes;

public class GeneratedTestCommentSetDataSetsNewDataAndUpdatesExistingValue {

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
    public void testCommentSetDataSetsNewDataAndUpdatesExistingValue() {
        Comment comment = new Comment("");
        comment.setData("new data");
        String newData = comment.getData();
        assertNotNull(newData);
        assertEquals("new data", newData);
    }

}