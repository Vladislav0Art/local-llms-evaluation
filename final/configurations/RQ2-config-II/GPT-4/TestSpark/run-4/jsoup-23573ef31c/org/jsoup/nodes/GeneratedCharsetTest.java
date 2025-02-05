package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("https://www.example.com");
        document.charset(Charset.forName("UTF-8"));
        Assert.assertEquals(Charset.forName("UTF-8"), document.charset());
    }

}