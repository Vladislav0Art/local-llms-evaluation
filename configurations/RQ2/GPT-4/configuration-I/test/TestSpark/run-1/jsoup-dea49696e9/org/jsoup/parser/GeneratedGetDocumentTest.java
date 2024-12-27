package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedGetDocumentTest {

    @Test
    public void getDocumentTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<html></html>"), "", parser);
        Document document = builder.getDocument();
        assertNotNull(document);
    }

}