package org.jsoup.nodes;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.when;

public class GeneratedCharsetSetTest {

    @Test
    public void charsetSetTest() {
        Document document = new Document("http://localhost");
        document.charset(Charset.forName("UTF-16"));
        Assert.assertEquals(Charset.forName("UTF-16"), document.charset());
    }

}