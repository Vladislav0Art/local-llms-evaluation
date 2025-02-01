package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Document doc = new Document("");
        assertEquals("#document", doc.nodeName());
    }

}