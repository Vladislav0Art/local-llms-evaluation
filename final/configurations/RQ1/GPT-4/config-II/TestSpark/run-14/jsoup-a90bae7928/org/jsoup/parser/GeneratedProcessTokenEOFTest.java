package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTokenEOFTest {

    @Test
    public void processTokenEOFTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.EOF();
        assertTrue(xmlTreeBuilder.process(token));
    }

}