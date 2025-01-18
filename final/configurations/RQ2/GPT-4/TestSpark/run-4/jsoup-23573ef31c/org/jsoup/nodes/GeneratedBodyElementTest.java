package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedBodyElementTest {

    @Test
    public void bodyElementTest() {
        Document document = new Document("http://test.url");
        Element body = document.body();
        assertNotNull(body);
    }

}