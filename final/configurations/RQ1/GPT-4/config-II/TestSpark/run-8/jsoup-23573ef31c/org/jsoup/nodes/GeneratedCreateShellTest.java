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

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://example.com");
        Assert.assertEquals("http://example.com", doc.location());
    }

}