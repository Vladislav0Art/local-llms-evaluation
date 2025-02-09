package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Properties;

public class GeneratedConvertToDocumentTest {

    @Test
    public void convertToDocumentTest() throws ParserConfigurationException {
        Document jsoupDoc = Parser.parse("<html></html>", "");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document xmlDoc = w3cDom.fromJsoup(jsoupDoc);
        w3cDom.convert(jsoupDoc, xmlDoc);
        assertNotNull(xmlDoc);
        assertEquals("#document", xmlDoc.getNodeName());
    }

}