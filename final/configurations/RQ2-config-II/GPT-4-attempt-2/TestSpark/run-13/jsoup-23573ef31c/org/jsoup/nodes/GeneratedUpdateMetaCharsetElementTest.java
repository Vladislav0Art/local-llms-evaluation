package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedUpdateMetaCharsetElementTest {

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("");
        document.updateMetaCharsetElement(true);
        Assert.assertTrue(document.updateMetaCharsetElement());
    }

}