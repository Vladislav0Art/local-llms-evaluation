package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.io.Reader;
import java.util.List;

public class GeneratedProcessTokenTest {

    @Test
    public void processTokenTest() {
        Token token = new Token();
        XmlTreeBuilder builder = new XmlTreeBuilder();
        boolean result = builder.process(token);
        assertTrue(result);
    }

}