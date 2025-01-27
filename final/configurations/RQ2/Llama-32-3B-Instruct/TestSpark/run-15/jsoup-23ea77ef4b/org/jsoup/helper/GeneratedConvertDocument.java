package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedConvertDocument {

    @Test
    public void convertDocument() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Document wDoc = W3CDom.convert(doc);
        assertNotNull(wDoc);
    }

}