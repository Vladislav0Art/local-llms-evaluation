package org.jsoup.nodes;

public class GeneratedTestGeneratedDummy {

    @Test
    public void testGeneratedDummy() {
        DummyDeclaration decl = new DummyDeclaration();
        assertEquals("html", decl.getTagName());
        assertTrue(decl instanceof DummyDeclaration);
        assertNotNull(comment);
    }
}

class Comment {
    private XmlDeclaration comment;

    public Comment(XmlDeclaration comment) {
        this.comment = comment;
    }

    public void setComment(XmlDeclaration comment) {
        this.comment = comment;
    }

    // getters and setters
}

class XmlDeclaration implements Comment {
    private String tagName;

    public XmlDeclaration(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public boolean isXmlDeclaration() {
        return true;
    }

    public String getTagName() {
        return tagName;
    }

    public XmlDeclaration asXmlDeclaration() {
        return this;
    }
}

class DummyDeclaration {
    private String tagName;

    public DummyDeclaration(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DummyDeclaration that = (DummyDeclaration) o;
        return tagName.equals(that.tagName);
    }

}