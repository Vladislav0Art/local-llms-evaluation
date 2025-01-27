package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsXmlDeclaration_test {

    @Test
    public void isXmlDeclaration_test() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

}