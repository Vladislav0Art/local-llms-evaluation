package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document document = new Document("");
        Element body = document.body();
        assertTrue(body.is("body"));
    }

}