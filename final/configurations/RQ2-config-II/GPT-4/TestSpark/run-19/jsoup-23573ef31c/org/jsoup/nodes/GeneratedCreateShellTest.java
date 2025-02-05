package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        String baseUri = "https://google.com";
        Document doc = Document.createShell(baseUri);
        Assert.assertEquals(baseUri, doc.baseUri());
    }

}