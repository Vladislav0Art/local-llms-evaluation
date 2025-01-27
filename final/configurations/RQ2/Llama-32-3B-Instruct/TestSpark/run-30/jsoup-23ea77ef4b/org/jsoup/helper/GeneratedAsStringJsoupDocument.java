package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedAsStringJsoupDocument {

    @Test
    public void asStringJsoupDocument() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        document.appendChild(document.createElement("div"));
        String output = W3CDom.asString(document, null);
        assertTrue(output.contains("<div>"));
    }

}