package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedConvertDocumentTest {

    @Test
    public void ConvertDocumentTest() {
        Document doc = Mockito.mock(Document.class);
        org.w3c.dom.Document result = W3CDom.convert(doc);
        Assert.assertNotNull(result);
    }

}