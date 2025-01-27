package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedConvertJsoupDocument {

    @Test
    public void convertJsoupDocument() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document = factory.newDocumentBuilder().parse(new ByteArrayInputStream("<html></html>".getBytes()));
        Document convertedDoc = W3CDom.convert(document);
        assertNotNull(convertedDoc.getDocumentElement());
    }

}