package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        final Reader input = new StringReader("<test></test>");
        final String baseUri = "http://test.com";
        final XmlTreeBuilder builder = new XmlTreeBuilder();
        final Parser parser = new Parser(builder);

        builder.initialiseParse(input, baseUri, parser);

        assertEquals(Document.OutputSettings.Syntax.xml, builder.doc.outputSettings().syntax());
        assertEquals(Entities.EscapeMode.base, builder.doc.outputSettings().escapeMode());
    }

}