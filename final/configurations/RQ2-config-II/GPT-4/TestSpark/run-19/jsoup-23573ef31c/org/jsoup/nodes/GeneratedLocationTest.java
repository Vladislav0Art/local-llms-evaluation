package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        String baseUri = "https://google.com";
        Document doc = new Document(baseUri);
        Assert.assertEquals(baseUri, doc.location());
    }

}