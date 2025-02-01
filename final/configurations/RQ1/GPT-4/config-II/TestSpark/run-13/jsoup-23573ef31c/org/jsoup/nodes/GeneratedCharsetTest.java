package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("");
        doc.charset(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, doc.charset());
    }

}