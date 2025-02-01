package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Document doc = Jsoup.parse("<p>Example</p>");
        assertEquals("Example", doc.text());
        doc.text("New Example");
        assertEquals("New Example", doc.text());
    }

}