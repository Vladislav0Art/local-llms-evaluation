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

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Document doc = new Document("http://example.com");
        doc.text("Test Text");
        Assert.assertEquals("Test Text", doc.body().text());
    }

}