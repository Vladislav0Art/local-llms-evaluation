package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedConvertJsoupElementToDocument {

    @Test
    public void convertJsoupElementToDocument() throws Exception {
        Element element = org.jsoup.nodes.Document.parse("<div>Hello World!</div>").getElementsByTag("div").first();
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html></html>".getBytes()));
        W3CDom.convert(element, document);
        assertNotNull(document.getDocumentElement());
    }

}