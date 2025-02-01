package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        List<Node> nodes = xmlTreeBuilder.parseFragment("<root><child></child></root>", "/", new Parser(xmlTreeBuilder));

        assertTrue(nodes.size() > 0);
        Node rootNode = nodes.get(0);
        assertEquals("<root><child></child></root>", rootNode.outerHtml());
    }

}