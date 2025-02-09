package org.jsoup.parser;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        Parser mockParser = Mockito.mock(Parser.class);
        List<Node> nodes = xb.parseFragment("<test></test>", "http://baseUri", mockParser);
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("test", ((Element) nodes.get(0)).nodeName());
    }

}