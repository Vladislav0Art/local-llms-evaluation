package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationFailsForEmptyFragment {

    @Public

    @Test
    public void asXmlDeclarationFailsForEmptyFragment() throws Exception {
        String data = "";
        Comment comment = new Comment(data);
        assertNull(comment.asXmlDeclaration());
    }
}

public class Comment {
    private String data;

    @Public
    public Comment(String data) {
        this.data = data;
    }

    @Public
    public String getData() {
        return data;
    }

    @Public
    public void setData(String data) {
        this.data = data;
    }

    @Public
    public Comment clone() {
        return new Comment(data);
    }

    @Public
    public boolean isXmlDeclaration() {
        return !data.isEmpty();
    }

    @Public
    public XmlDeclaration asXmlDeclaration() {
        if (isXmlDeclaration()) {
            // implementation to parse DOCTYPE html and extract tag name
            // for simplicity, return a dummy declaration
            return new DummyDeclaration("html");
        } else {
            return null;
        }
    }
}

public class DummyDeclaration implements XmlDeclaration {
    private String tagName;

    @Public
    public DummyDeclaration(String tagName) {
        this.tagName = tagName;
    }

    @Public
    public String getTagName() {
        return tagName;
    }

}