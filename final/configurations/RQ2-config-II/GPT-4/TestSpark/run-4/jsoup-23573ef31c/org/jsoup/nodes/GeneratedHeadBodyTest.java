package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedHeadBodyTest {

    @Test
    public void headBodyTest() {
        Document document = Document.createShell("https://www.example.com");
        Assert.assertNotNull(document.head());
        Assert.assertNotNull(document.body());
    }

}