package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsNullIfNoData {

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