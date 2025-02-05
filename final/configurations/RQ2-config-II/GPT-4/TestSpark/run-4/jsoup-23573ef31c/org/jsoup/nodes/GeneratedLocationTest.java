package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        Document document = new Document("https://www.example.com");
        Assert.assertEquals("https://www.example.com", document.location());
    }

}