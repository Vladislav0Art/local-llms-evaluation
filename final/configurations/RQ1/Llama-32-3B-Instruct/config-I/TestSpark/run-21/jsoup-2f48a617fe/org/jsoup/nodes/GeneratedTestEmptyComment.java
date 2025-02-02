package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEmptyComment {

    @Test
    public void testEmptyComment() {
        // Given
        XmlDeclaration comment = new XmlDeclaration();

        // When
        Comment emptyComment = new Comment().createEmpty();

        // Then
        assertTrue(emptyComment.asXmlDeclaration().toString().isEmpty());
    }
}

public class Comment {
    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public void accumulate(XmlDeclaration... comments) {
        // implementation of accumulation logic
    }

    public static XmlDeclaration createEmpty() {
        return new XmlDeclaration();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        return data.equals(comment.data);
    }
}

public class XmlDeclaration {
    private String data;

    public XmlDeclaration(String data) {
        this.data = data;
    }

    public static XmlDeclaration fromXml(String xml) {
        // implementation of parsing logic
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XmlDeclaration that = (XmlDeclaration) o;

        return data.equals(that.data);
    }

}