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

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag("p");
        xmlTreeBuilder.stack.add(new Element("p", "http://test.com"));
        xmlTreeBuilder.popStackToClose(endTag);
        assertTrue(xmlTreeBuilder.stack.isEmpty());
    }

}