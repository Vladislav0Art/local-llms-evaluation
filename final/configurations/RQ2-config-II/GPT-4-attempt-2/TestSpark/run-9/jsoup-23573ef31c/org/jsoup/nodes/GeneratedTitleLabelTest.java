package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTitleLabelTest {

    @Test
    public void titleLabelTest() {
        Document document = new Document("http://baseuri.com");
        document.title("Page Title");
        Assert.assertEquals("Page Title", document.title());
    }

}