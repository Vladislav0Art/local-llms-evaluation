package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root><child1><child2/></child1><child3/></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.runParser();
        xmlTreeBuilder.popStackToClose(new Token.EndTag("child1"));
        assertEquals("<root><child1></child1><child3></child3></root>", xmlTreeBuilder.getSettings().toString());
    }

}