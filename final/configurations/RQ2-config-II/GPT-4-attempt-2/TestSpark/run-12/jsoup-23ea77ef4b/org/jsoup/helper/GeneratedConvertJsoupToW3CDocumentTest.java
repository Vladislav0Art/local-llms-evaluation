package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertJsoupToW3CDocumentTest {

    @Test
    public void ConvertJsoupToW3CDocumentTest() {
        Document doc = new Document("test");
        org.w3c.dom.Document result = W3CDom.convert(doc);
        assertNotNull(result);
    }

}