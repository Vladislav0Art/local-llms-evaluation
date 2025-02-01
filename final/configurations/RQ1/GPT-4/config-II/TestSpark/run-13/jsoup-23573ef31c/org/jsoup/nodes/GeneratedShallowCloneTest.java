package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Document doc = new Document("");
        Document cloned = doc.shallowClone();
        assertEquals(doc.outerHtml(), cloned.outerHtml());
    }

}