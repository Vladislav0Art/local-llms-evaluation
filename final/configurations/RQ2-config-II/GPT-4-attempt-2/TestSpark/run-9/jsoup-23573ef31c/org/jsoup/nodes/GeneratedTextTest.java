package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Document document = new Document("http://texttest.com");
        document.text("Doc text");
        Assert.assertEquals("Doc text", document.text());
    }

}