package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentStringTest {

    @Test
    public void parseFragmentStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<xml></xml>", "http://test.com", xmlTreeBuilder.getParser());
        assertFalse(nodes.isEmpty());
    }

}