package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedProcessTokenTest {

    @Test
    public void processTokenTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<html></html>"), "", parser);

        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "html";
        assertTrue(builder.process(startTag));
    }

}