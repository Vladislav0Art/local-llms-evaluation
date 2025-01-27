package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsNullIfNotDeclaration {

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

}