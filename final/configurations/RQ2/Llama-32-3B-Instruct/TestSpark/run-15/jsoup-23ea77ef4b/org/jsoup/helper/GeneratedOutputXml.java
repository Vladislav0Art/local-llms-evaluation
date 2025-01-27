package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedOutputXml {

    @Test
    public void outputXml() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        HashMap<String, String> result = W3CDom.OutputXml(doc);
        assertNotNull(result);
    }

}