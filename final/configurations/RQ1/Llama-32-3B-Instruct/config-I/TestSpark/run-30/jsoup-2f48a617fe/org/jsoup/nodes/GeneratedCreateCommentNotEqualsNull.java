package org.jsoup.nodes;

public class GeneratedCreateCommentNotEqualsNull {

    private String data;
    private String nodeName;

    public Comment(String data) {
        if (data == null || data.isEmpty()) {
            this.data = "#comment";
        } else {
            this.data = data;
            this.nodeName = "#comment";
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNodeName() {
        return nodeName;
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
    public void createCommentNotEqualsNull() {
        String data = "Hello, world!";
        Comment comment1 = new Comment(data);
        Comment comment2 = new Comment("Goodbye, world!");
        assertFalse(comment1.equals(comment2));
    }

}