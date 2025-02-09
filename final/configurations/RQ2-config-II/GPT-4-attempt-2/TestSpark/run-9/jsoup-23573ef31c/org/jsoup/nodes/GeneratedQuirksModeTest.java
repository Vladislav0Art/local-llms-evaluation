package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://quirksmodetest.com");
        document.quirksMode(Document.QuirksMode.quirks);
        Assert.assertEquals(Document.QuirksMode.quirks, document.quirksMode());
    }

}