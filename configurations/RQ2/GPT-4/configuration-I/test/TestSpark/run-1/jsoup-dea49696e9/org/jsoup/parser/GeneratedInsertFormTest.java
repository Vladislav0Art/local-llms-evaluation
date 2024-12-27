package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertFormTest {

    @Test
    public void insertFormTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<html><body></body></html>"), "", parser);

        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "form";
        FormElement form = builder.insertForm(startTag, false, true);
        assertNotNull(form);
    }

}