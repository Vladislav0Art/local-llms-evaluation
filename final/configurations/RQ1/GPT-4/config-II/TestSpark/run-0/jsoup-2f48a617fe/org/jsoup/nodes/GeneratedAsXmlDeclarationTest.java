package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment1 = new Comment("?xml version='1.0' encoding='UTF-8'");
        XmlDeclaration declaration = comment1.asXmlDeclaration();
        assertNotNull(declaration);
        assertTrue(declaration.isProcessingInstruction());

        Comment comment2 = new Comment("This is not a XML Declaration");
        assertNull(comment2.asXmlDeclaration());
    }

}