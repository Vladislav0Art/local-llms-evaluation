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
public class GeneratedOutputXmlTest_returnsCorrectOutput {

    @Test
    public void OutputXmlTest_returnsCorrectOutput() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Map<String, String> properties = W3CDom.OutputXml();
        assertTrue(properties.containsKey("xml:version"));
    }

}