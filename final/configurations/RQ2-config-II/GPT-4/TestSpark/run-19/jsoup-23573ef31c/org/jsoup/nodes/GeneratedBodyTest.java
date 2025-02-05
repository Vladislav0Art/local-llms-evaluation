package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document doc = Document.createShell("https://google.com");
        Element body = doc.body();
        Assert.assertNotNull(body);
    }

}