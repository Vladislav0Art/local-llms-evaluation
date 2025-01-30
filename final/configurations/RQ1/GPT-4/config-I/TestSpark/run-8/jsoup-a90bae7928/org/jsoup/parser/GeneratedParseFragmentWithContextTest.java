package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        Document context = Jsoup.parse("<html><body><div></div></body></html>", "", Parser.xmlParser());
        Element body = context.select("body").first();
        Parser parser = Parser.xmlParser();
        List<Node> nodes = parser.parseFragment("<tag>Test content</tag>", body, "");
        assertEquals("<tag>Test content</tag>", nodes.get(0).toString());
    }

}