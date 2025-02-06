package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclaration {

    @Test
    public void isXmlDeclaration() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

}