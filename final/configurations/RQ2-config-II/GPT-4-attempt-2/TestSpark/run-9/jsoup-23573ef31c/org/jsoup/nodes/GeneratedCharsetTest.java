package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("http://charsettest.com");
        document.charset(StandardCharsets.UTF_8);
        Assert.assertEquals(StandardCharsets.UTF_8, document.charset());
    }

}