package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCloneAndShallowCloneTest {

    @Test
    public void cloneAndShallowCloneTest() {
        Document document = new Document("http://example.com");
        Document clone = document.clone();
        Document shallowClone = document.shallowClone();

        Assert.assertNotSame(document, clone);
        Assert.assertEquals(document, clone);
        Assert.assertNotSame(document, shallowClone);
        Assert.assertEquals(document, shallowClone);
    }

}