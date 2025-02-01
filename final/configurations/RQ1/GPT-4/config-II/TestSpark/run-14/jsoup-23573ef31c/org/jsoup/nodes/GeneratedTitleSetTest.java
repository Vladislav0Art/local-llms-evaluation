package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTitleSetTest {

    @Test
    public void titleSetTest() {
        Document doc = Jsoup.parse("<title>test</title>");
        doc.title("new title");
        assertEquals("new title", doc.title());
    }

}