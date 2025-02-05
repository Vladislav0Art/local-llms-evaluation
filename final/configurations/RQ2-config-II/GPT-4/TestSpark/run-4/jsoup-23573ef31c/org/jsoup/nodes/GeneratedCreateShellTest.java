package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("https://www.example.com");
        Assert.assertEquals("https://www.example.com", document.location());
    }

}