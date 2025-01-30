package org.jsoup.parser;

import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.process(new Token.StartTag()));
        assertTrue(xmlTreeBuilder.process(new Token.EndTag()));
        assertTrue(xmlTreeBuilder.process(new Token.Comment()));
        assertTrue(xmlTreeBuilder.process(new Token.Character()));
        assertTrue(xmlTreeBuilder.process(new Token.Doctype()));
        assertTrue(xmlTreeBuilder.process(new Token.EOF()));
    }

}