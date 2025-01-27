package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclaration_test {

    @Test
    public void isXmlDeclaration_test() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

}