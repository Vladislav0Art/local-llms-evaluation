package org.jsoup.nodes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Nullable;

public class GeneratedTestAsXmlDeclaration {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
        ParseSettings settings = new ParseSettings().setPrettyPrint(true);
        Parser parser = Parser.htmlParser(settings).parse("<!-- This is a comment -->");
        Element root = parser.documentElement();
        document.appendChild(root);
    }

    @Test
    public void testAsXmlDeclaration() {
        String xmlDeclarationData = "<!-- This is a comment -->";
        XmlDeclaration asXmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(asXmlDeclaration);
    }

}