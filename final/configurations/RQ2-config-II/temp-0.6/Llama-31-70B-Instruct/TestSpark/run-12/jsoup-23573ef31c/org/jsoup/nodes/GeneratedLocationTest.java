package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.location()).thenReturn("www.example.com");
        String location = document.location();
        Assert.assertEquals("www.example.com", location);
    }

}