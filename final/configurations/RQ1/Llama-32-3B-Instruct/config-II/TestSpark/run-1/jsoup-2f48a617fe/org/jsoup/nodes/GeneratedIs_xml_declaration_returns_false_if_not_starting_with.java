package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIs_xml_declaration_returns_false_if_not_starting_with {

    @Test
    public void is_xml_declaration_returns_false_if_not_starting_with() {
        Comment comment = new Comment("This is a comment");
        assertFalse(comment.isXmlDeclaration());
    }

}