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

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() throws ParserConfigurationException {
        Document jsoupDoc = Parser.parse("<html></html>", "");
        org.w3c.dom.Document xmlDoc = W3CDom.convert(jsoupDoc);
        assertNotNull(xmlDoc);
        assertEquals("#document", xmlDoc.getNodeName());
    }

}