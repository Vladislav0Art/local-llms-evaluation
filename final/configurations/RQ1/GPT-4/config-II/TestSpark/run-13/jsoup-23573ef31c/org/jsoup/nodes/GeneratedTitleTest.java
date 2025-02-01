package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document doc = Jsoup.parse("<title>Example</title>");
        assertEquals("Example", doc.title());
        doc.title("New Example");
        assertEquals("New Example", doc.title());
    }

}