package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedAsString_RetursNonNullString {

    @Test
    public void asString_RetursNonNullString() throws Exception {
        Document doc = new org.jsoup.nodes.Document();
        doc.getDocumentElement().setTagName("root");
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
        assertEquals("<root></root>", result);
    }

}