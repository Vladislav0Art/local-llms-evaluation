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

public class GeneratedParseFragmentWithoutContextTest {

    @Test
    public void parseFragmentWithoutContextTest() {
        Parser parser = Parser.xmlParser();
        List<Node> nodes = parser.parseXmlFragment("<tag>Test content</tag>", "");
        assertEquals("<tag>Test content</tag>", nodes.get(0).toString());
    }

}