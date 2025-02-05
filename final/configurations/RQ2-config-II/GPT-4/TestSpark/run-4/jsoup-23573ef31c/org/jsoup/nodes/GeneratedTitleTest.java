package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = Document.createShell("https://www.example.com");
        document.title("Test title");
        Assert.assertEquals("Test title", document.title());
    }

}