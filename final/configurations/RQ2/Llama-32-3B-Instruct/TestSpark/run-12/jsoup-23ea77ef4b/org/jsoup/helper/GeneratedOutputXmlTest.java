package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOutputXmlTest {

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertEquals(OutputKeys.METHOD, result.get(METHOD));
    }
}

class Document extends org.jsoup.nodes.Document {
    public Document() {
    }
}

class Element extends org.jsoup.nodes.Element {
    public Element() {
    }

}