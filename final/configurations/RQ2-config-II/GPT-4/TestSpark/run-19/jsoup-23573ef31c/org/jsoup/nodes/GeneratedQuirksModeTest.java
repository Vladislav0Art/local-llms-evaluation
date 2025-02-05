package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document doc = new Document("https://google.com");
        doc.quirksMode(QuirksMode.quirks);
        Assert.assertEquals(QuirksMode.quirks, doc.quirksMode());
    }

}