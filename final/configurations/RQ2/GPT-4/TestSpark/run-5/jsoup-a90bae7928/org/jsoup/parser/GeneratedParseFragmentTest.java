package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = Parser.xmlParser();
        List<Node> nodes = builder.parseFragment("<test></test>", "http://test.com", parser);
        assertFalse(nodes.isEmpty());
        assertEquals(nodes.get(0).nodeName(), "test");
    }

}