package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertEquals(1, xmlTreeBuilder.parseFragment("<test></test>", new Element("test"), "", null).size());
    }

}