package org.jsoup.nodes;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.when;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("http://localhost");
        Assert.assertEquals(Charset.forName("UTF-8"), document.charset());
    }

}