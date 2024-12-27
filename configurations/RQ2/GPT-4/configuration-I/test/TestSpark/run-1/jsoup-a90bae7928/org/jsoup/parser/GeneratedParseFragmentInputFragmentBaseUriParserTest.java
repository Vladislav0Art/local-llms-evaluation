package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentInputFragmentBaseUriParserTest {

    @Test
    public void parseFragmentInputFragmentBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<element>content</element>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "http://base.uri", Parser.xmlParser());
        assertNotNull(nodes);
    }

}