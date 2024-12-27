package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedGetDocumentTest {

    @Test
    public void getDocumentTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Document document = htmlTreeBuilder.getDocument();

        assertNotNull(document);
    }

}