package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        String input = "<test>data</test>";
        Parser parser = new Parser(new XmlTreeBuilder());
        XmlTreeBuilder xmlTreeBuilder = spy(XmlTreeBuilder.class);
        xmlTreeBuilder.initialiseParse(new StringReader(input), "", parser);
        assertFalse(xmlTreeBuilder.stack.isEmpty());
    }

}