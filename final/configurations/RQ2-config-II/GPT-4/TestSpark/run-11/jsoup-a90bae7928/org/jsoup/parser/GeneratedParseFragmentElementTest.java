package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentElementTest {

    @Test
    public void parseFragmentElementTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("xml"), "");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<xml></xml>", context, "http://test.com", xmlTreeBuilder.getParser());
        assertFalse(nodes.isEmpty());
    }

}