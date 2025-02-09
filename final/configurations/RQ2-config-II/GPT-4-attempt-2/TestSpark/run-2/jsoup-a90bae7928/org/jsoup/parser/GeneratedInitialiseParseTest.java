package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader input = new StringReader("<tag></tag>");
        builder.initialiseParse(input, "", Parser.xmlParser());
        assertTrue(builder instanceof XmlTreeBuilder);
    }

}