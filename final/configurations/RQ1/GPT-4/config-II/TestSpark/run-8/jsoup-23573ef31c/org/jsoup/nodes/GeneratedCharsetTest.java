package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.FormElement;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;
import javax.annotation.Nullable;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com");
        doc.charset(Charset.forName("ISO-8859-1"));
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.charset());
    }

}