package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document document = new Document("https://www.google.com");
        Document.QuirksMode mode = Document.QuirksMode.NO_QUIRKS;
        document.quirksMode(mode);
        Assert.assertEquals(mode, document.quirksMode());
    }

}