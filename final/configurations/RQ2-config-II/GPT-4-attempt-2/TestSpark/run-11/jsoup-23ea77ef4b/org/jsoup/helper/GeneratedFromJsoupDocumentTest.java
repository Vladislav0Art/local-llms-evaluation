package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() throws ParserConfigurationException {
        Document inputDocument = new Document("");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document outputDocument = w3CDom.fromJsoup(inputDocument);
        assertNotNull(outputDocument);
    }

}