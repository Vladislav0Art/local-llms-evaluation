package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAsXmlDeclarationEmptyStringTest {

    @Test
    public void asXmlDeclarationEmptyStringTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}