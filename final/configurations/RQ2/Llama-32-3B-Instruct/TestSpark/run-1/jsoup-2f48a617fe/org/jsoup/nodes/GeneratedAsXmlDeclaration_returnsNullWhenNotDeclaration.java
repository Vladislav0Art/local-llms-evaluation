package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedAsXmlDeclaration_returnsNullWhenNotDeclaration {

    @Test
    public void asXmlDeclaration_returnsNullWhenNotDeclaration() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}