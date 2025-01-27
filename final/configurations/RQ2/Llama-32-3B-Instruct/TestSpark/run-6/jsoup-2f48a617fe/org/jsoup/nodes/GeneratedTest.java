package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNodeCreatesCommentWithData() {
        // Given
        String data = "expectedData";

        // When
        Comment comment = new Comment(data);

        // Then
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameReturnsCorrectString() {
        // Given
        Comment comment = new Comment("test");

        // When
        String expectedNodeName = "COMMENT";

        // Then
        assertEquals(expectedNodeName, comment.nodeName());
    }

    @Test
    public void setDataSetsCorrectDataInComment() {
        // Given
        Comment comment = new Comment("oldData");
        String expectedData = "expectedData";

        // When
        comment.setData(expectedData);

        // Then
        assertEquals(expectedData, comment.getData());
    }

    @Test
    public void outerHtmlHeadAppendsCorrectStringToAccum() throws IOException {
        // Given
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        // When
        Comment comment = new Comment("test");
        comment.outerHtmlHead(accum, depth, out);

        // Then
        assertEquals("<!-- test -->", accum.toString());
    }

    @Test
    public void outerHtmlTailAppendsCorrectStringToAccum() {
        // Given
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        // When
        Comment comment = new Comment("test");
        comment.outerHtmlTail(accum, depth, out);

        // Then
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringReturnsCorrectString() {
        // Given
        Comment comment = new Comment("test");

        // When
        String expectedString = "<!-- test -->";

        // Then
        assertEquals(expectedString, comment.toString());
    }

    @Test
    public void cloneReturnsNewCommentWithSameData() {
        // Given
        Comment comment = new Comment("oldData");
        String expectedData = "expectedData";

        // When
        Comment clonedComment = comment.clone();

        // Then
        assertEquals(expectedData, clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationReturnsFalse() {
        // Given
        Comment comment = new Comment("test");

        // When
        boolean expectedResult = false;

        // Then
        assertTrue(resultExpectedResult = comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsNullIfNotDeclaration() {
        // Given
        Comment comment = new Comment("test");
        XmlDeclaration expectedDecl = null;

        // When
        @Nullable XmlDeclaration result = comment.asXmlDeclaration();

        // Then
        assertNull(result);
    }

    @Test
    public void asXmlDeclarationReturnsNullIfNoData() {
        // Given
        Comment comment = new Comment("");
        XmlDeclaration expectedDecl = null;

        // When
        @Nullable XmlDeclaration result = comment.asXmlDeclaration();

        // Then
        assertNull(result);
    }

}