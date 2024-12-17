package org.jsoup.nodes;

public class GeneratedTestGetData {

    @Override
    public String nodeName() {
        return "Comment";
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

public class XmlDeclaration extends Comment {

    private String type;

    public XmlDeclaration(String data, String type) {
        super(data);
        this.type = type;
    }

    @Override
    @Nullable
    public XmlDeclaration asXmlDeclaration() {
        if (this.type.equals("xml")) {
            return this;
        } else {
            throw new UnsupportedOperationException();
        }
    }
}

public class CommentTest {

    @Test
    public void testGetData() {
        Comment comment = new Comment("Test content");
        assertNotNull(comment.getData());
        assertEquals("Test content", comment.getData());
    }

}