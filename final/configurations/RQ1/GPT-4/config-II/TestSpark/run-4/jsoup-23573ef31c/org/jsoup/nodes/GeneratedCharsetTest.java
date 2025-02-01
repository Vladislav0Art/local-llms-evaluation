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

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

}