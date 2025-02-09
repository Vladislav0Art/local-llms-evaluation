package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("https://example.com");
        Assert.assertEquals("", document.title());
    }

}