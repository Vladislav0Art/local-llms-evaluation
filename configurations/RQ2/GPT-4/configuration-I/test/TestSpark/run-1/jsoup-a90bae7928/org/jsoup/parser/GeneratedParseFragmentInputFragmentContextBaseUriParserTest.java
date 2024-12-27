package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentInputFragmentContextBaseUriParserTest {

    @Test
    public void parseFragmentInputFragmentContextBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<child>content</child>";
        Element context = new Element(Tag.valueOf("parent"), "");
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, context, "http://base.uri", Parser.xmlParser());
        assertNotNull(nodes);
    }

}