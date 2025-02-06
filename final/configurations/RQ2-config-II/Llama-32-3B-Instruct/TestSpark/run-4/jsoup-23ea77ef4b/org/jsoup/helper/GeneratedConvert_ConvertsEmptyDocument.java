package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedConvert_ConvertsEmptyDocument {

    @Test
    public void convert_ConvertsEmptyDocument() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        StringWriter writer = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(writer);
        transformer.transform(source, result);
        String xml = writer.toString();
        assertTrue(xml.isEmpty());
    }

}