package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedConvertElementMethod {

    @Test
    public void convertElementMethod() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        Element in = doc.createElement("div");
        Document out = new Document();
        W3CDom.convert(in, out);
        assertTrue(out.getTree().trim().equals(in.getTree().trim()));
    }

}