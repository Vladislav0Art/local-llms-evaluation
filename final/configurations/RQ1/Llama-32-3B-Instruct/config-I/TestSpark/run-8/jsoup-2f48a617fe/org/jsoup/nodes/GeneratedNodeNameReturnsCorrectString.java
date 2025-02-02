package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;

public class GeneratedNodeNameReturnsCorrectString {

    @Test
    public void nodeNameReturnsCorrectString() {
        Comment comment = new Comment("Hello World");
        assertEquals("#comment", comment.nodeName());
    }

}