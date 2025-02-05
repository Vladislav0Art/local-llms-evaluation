package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("http://baseuri.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        Assert.assertEquals(charset, document.charset());
    }

}