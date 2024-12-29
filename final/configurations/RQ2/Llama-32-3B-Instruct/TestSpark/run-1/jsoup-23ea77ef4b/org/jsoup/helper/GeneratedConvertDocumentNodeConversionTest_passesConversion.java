package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GeneratedConvertDocumentNodeConversionTest_passesConversion {

    @Test
    public void convertDocumentNodeConversionTest_passesConversion() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Node node = doc.getDocumentElement();
        org.jsoup.nodes.Document jsoupDoc = W3CDom.convert(node);
        assertEquals(1, jsoupDoc.text().length());
    }

}