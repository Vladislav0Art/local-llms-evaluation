package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentMethod {

    @Test
    public void convertDocumentMethod() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Document out = new Document();
        W3CDom.convert(doc, out);
        assertTrue(out.getTree().trim().equals(doc.getTree().trim()));
    }

}