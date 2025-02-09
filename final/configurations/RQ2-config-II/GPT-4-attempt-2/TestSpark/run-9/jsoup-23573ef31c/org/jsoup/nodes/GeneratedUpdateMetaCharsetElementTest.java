package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedUpdateMetaCharsetElementTest {

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://updatemetacharset.com");
        document.updateMetaCharsetElement(true);
        Assert.assertTrue(document.updateMetaCharsetElement());
    }

}