package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document document = Document.createShell("http://example.com");
        Assert.assertNotNull(document.head());
    }

}