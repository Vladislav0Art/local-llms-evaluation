package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        String title = "Test Title";
        Document doc = Document.createShell("https://google.com");
        doc.title(title);
        Assert.assertEquals(title, doc.title());
    }

}