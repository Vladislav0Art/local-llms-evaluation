package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationForEmptyCommentReturnsNull {

    @Test
    public void asXmlDeclarationForEmptyCommentReturnsNull() {
        assertNull(new Comment("").asXmlDeclaration());
    }

}