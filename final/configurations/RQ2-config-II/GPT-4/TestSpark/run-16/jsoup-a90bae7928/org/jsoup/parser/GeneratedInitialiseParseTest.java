package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader input = new StringReader("<tag>text</tag>");
        Parser parser = new Parser(builder);
        builder.initialiseParse(input, "http://example.com", parser);
    }

}