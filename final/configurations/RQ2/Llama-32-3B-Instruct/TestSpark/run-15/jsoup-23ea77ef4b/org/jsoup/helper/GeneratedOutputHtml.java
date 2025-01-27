package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedOutputHtml {

    @Test
    public void outputHtml() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        HashMap<String, String> result = W3CDom.OutputHtml(doc);
        assertNotNull(result);
    }

}