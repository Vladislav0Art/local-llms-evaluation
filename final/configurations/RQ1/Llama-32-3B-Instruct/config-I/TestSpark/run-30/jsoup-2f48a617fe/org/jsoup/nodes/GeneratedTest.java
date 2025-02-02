package org.jsoup.nodes;

public class GeneratedTest {

    private String data;
    private String nodeName;

    public static Comment createComment(String data) {
        if (data == null || data.isEmpty()) {
            return new Comment("#comment");
        } else {
            return new Comment(data, "#comment");
        }
    }

    private Comment(String data, String nodeName) {
        this.data = data;
        this.nodeName = nodeName;
    }

    public static boolean isXmlDeclaration(String data) {
        // Implementation of isXmlDeclaration
        if (data != null && data.startsWith("<") && data.endsWith(">")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return nodeName.equals(comment.nodeName);
    }
}

public class CommentTest {

    @Test
    public void createCommentConstructorsEqual() {
        String data = "Hello, world!";
        Comment comment1 = new Comment(data);
        Comment comment2 = new Comment(data);
        assertEquals(comment1, comment2);
    }

    @Test
    public void createCommentEqualsNull() {
        Comment comment1 = new Comment(null);
        Comment comment2 = null;
        assertTrue(comment1.equals(comment2));
    }

    @Test
    public void createCommentNotEqualsNull() {
        String data = "Hello, world!";
        Comment comment1 = new Comment(data);
        Comment comment2 = new Comment("Goodbye, world!");
        assertFalse(comment1.equals(comment2));
    }

    @Test
    public void nodeNameEqualsExpected() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataEmptyStringReturnsEmptyString() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void getDataNotEmptyStringReturnsData() {
        String data = "Hello, world!";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void setDataSetsDataCorrectly() throws IOException {
        String data = "Hello, world!";
        Comment comment = new Comment(data);
        comment.setData("Goodbye, world!");
        assertEquals("Goodbye, world!", comment.getData());
    }

    @Test
    public void asXmlDeclarationReturnsNullWhenCannotBeParsed() throws IOException {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsExpectedResultForValidXmlDeclarationData() throws IOException {
        String data = "!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
        Comment comment = new Comment(data);
        XmlDeclaration expectedDecl = new XmlDeclaration("html", true);
        assertEquals(expectedDecl, comment.asXmlDeclaration());
    }

}