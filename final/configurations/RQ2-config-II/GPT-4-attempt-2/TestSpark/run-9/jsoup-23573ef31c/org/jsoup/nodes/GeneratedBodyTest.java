package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document document = Document.createShell("http://yetanotherexample.com");
        Assert.assertNotNull(document.body());
    }

}