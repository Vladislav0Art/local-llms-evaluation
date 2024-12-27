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

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        StringReader stringReader = new StringReader("testInput");

        htmlTreeBuilder.initialiseParse(stringReader, "baseUri", new Parser(htmlTreeBuilder));
    }

}