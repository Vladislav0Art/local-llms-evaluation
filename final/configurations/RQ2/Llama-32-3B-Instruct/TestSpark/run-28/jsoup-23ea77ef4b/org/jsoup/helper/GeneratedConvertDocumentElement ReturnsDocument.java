package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedConvertDocumentElement ReturnsDocument {

    @Test
    public void convertDocumentElement

    ReturnsDocument() {
        org.jsoup.nodes.Document inDoc = null;
        org.jsoup.nodes.Element inElem = new org.jsoup.nodes.Document();
        Document outDoc = W3CDom.convert(inDoc, inElem);
        assertNotNull(outDoc);
    }

}