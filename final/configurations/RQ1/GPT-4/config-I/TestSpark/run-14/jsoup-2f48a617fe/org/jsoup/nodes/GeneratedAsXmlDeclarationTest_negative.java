package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest_negative {

    @Test
    public void AsXmlDeclarationTest_negative() {
        Comment comment = new Comment("This is not an XML declaration");
        XmlDeclaration xml = comment.asXmlDeclaration();
        assertNull(xml);
    }

}