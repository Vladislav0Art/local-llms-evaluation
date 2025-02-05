package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("https://google.com");
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        Assert.assertEquals(charset, doc.charset());
    }

}