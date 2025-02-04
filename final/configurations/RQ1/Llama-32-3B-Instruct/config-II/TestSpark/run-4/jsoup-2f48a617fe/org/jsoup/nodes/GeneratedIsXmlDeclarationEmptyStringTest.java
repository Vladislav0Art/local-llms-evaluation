package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneratedIsXmlDeclarationEmptyStringTest {

    @Test
    public void isXmlDeclarationEmptyStringTest() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

}