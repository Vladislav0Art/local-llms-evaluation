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

public class GeneratedAsStringFromDocumentTest {

    @Test
    public void asStringFromDocumentTest() throws Exception {
        Document inputDocument = new Document("");
        org.w3c.dom.Document outputDocument = W3CDom.convert(inputDocument);
        String result = W3CDom.asString(outputDocument, null);
        assertNotNull(result);
    }

}