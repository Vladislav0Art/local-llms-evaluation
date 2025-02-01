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

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Document doc = new Document("http://example.com");
        Connection con = Jsoup.newSession();
        doc.connection(con);
        assertEquals(con, doc.connection());
    }

}