package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCharsetGetSetTest {

    @Test
    public void charsetGetSetTest() {
        Document doc = new Document("http://test.com");
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        Assert.assertEquals(charset, doc.charset());
    }

}