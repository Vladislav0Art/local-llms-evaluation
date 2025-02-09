package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document document = Document.createShell("http://anotherexample.com");
        Assert.assertNotNull(document.head());
    }

}