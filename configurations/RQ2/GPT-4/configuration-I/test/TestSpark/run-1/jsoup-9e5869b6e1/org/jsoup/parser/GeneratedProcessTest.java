package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Token.StartTag token = new Token.StartTag();
        token.name = "html";

        builder.initialiseParse(new StringReader("<html>Test</html>"), "http://test.com", Parser.htmlParser());
        boolean result = builder.process(token);

        assertTrue(result);
    }

}