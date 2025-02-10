package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

import java.io.Reader;
import java.io.StringReader;

public class Generated[parseFragment_fragmentWithInvalidXmlAndBaseUri]

Test {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void [parseFragment_fragmentWithInvalidXmlAndBaseUri]Test() throws Exception {
        String inputFragment = "<fragment><invalid xml></invalid xml></fragment>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, null, "baseUri");
        assertNull(nodes);
    }

}