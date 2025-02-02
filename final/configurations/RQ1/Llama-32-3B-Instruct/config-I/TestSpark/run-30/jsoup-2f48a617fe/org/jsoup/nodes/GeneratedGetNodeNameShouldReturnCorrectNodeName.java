package org.jsoup.nodes;

public class GeneratedGetNodeNameShouldReturnCorrectNodeName {

    private String data;
    private String nodeName;

    public Comment(String data) {
        this.data = data;
        this.nodeName = "#comment";
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
        return true; // Replace with actual implementation
    }
}

public class CommentTest {

    @Test
    public void getNodeNameShouldReturnCorrectNodeName() {
        Comment comment = new Comment("Hello, world!");
        assertEquals("#comment", comment.getNodeName());
    }

}