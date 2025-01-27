package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedAsStringDocument {

    @Test
    public void asStringDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html><body><div>Hello World!</div></body></html>".getBytes()));
        String output = W3CDom.asString(document);
        assertTrue(output.contains("<html><body><div>Hello World!</div></body></html>"));
    }

}