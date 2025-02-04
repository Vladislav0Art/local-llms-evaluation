package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIs_xml_declaration_returns_true_if_comment_startsWith {

    @Test
    public void is_xml_declaration_returns_true_if_comment_startsWith() {
        Comment comment = new Comment("!XML Declaration");
        assertTrue(comment.isXmlDeclaration());
    }

}