package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;

public class GeneratedLocationTest1 {

    @Test
    public void locationTest1() {
        String baseUri = "http://www.example.com";
        Document document = Document.createShell(baseUri);
        Assert.assertEquals(baseUri, document.location());
    }

}