package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document doc = new Document("");
        Document cloned = doc.clone();
        assertEquals(doc.outerHtml(), cloned.outerHtml());
    }

}