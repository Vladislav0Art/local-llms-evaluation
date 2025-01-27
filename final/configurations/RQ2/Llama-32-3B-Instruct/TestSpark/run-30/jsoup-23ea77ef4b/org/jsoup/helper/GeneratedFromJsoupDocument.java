package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedFromJsoupDocument {

    @Test
    public void fromJsoupDocument() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html></html>".getBytes()));
        Document convertedDoc = W3CDom.fromJsoup(document);
        assertNotNull(convertedDoc.getDocumentElement());
    }

}