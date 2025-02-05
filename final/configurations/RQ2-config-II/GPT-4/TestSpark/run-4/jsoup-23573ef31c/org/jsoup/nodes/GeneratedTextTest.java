package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Document document = new Document("https://www.example.com");
        document.text("Test text");
        Assert.assertEquals("Test text", document.text());
    }

}