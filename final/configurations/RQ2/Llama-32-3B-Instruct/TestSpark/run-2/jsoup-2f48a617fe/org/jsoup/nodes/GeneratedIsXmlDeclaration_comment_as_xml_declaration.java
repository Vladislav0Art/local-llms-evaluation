package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclaration_comment_as_xml_declaration {

    @Test
    public void isXmlDeclaration_comment_as_xml_declaration() {
        Comment comment = new Comment("<!--XMLDeclaration:CommentData-->");
        assertTrue(comment.isXmlDeclaration());
    }

}