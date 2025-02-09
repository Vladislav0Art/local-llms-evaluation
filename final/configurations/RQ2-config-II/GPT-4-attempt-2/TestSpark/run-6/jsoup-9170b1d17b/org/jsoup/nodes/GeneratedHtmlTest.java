package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() throws IOException {
        Attributes att = new Attributes();
        att.put("key", "value");
        String html = att.html();
        assertTrue(html.contains("key=\"value\""));
    }

}