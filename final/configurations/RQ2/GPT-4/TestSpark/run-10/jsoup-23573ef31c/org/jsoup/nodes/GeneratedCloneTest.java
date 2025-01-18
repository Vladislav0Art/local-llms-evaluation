package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document document = new Document("https://www.google.com");
        Document clone = document.clone();
        Assert.assertEquals(document.outerHtml(), clone.outerHtml());
    }

}