package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.TextNode;

import java.io.Reader;
import java.util.List;

public class GeneratedParseFragment_WithValidXmlAndNoBaseUriCallsInitialise {

    @Test
    public void parseFragment_WithValidXmlAndNoBaseUriCallsInitialise() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> result = builder.parseFragment("<root>Hello World!</root>", "", null);
        assertNotNull(result);
    }

}