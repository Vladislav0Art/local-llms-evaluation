package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("");
        document.charset(Charset.forName("UTF-8"));
        Assert.assertEquals(Charset.forName("UTF-8"), document.charset());
    }

}