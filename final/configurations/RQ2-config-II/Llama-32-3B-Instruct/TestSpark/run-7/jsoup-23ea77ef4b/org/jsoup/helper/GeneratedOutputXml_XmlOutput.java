package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOutputXml_XmlOutput {

    @Test
    public void OutputXml_XmlOutput() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        HashMap<String, String> expectedXml = new HashMap<>();
        W3CDom.OutputXml(document);
        assertEquals(expectedXml, W3CDom.OutputXml(document));
    }

}