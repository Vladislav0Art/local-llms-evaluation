package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("!DOCTYPE html");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals("html", xmlDeclaration.name());
        assertTrue(xmlDeclaration.isProcessingInstruction());
    }

}