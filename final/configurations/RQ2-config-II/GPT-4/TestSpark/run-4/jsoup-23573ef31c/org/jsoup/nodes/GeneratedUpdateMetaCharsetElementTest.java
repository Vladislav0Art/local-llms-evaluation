package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUpdateMetaCharsetElementTest {

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("https://www.example.com");
        document.updateMetaCharsetElement(true);
        Assert.assertEquals(true, document.updateMetaCharsetElement());
    }

}