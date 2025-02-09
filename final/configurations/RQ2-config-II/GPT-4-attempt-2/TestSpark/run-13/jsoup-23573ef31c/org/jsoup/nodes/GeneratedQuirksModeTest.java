package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document document = new Document("");
        Document.QuirksMode quirksMode = Document.QuirksMode.quirks;
        document.quirksMode(quirksMode);
        Assert.assertEquals(quirksMode, document.quirksMode());
    }

}