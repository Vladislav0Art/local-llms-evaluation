package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertFromDocumentToDocumentTest {

    @Test
    public void convertFromDocumentToDocumentTest() {
        Document jsoupDoc = new Document("/path");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(jsoupDoc);
        assertNotNull(w3cDoc);
    }

}