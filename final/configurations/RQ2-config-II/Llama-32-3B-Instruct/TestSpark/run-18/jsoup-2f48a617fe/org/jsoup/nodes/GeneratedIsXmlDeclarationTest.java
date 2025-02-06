package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

}