package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        Document document = new Document("https://example.com");
        Assert.assertEquals("https://example.com", document.location());
    }

}