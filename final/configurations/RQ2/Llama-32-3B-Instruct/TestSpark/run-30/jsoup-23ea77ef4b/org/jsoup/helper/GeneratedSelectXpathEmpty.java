package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedSelectXpathEmpty {

    @Test
    public void selectXpathEmpty() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html><body></body></html>".getBytes()));
        NodeList nodeList = W3CDom.selectXpath("//div", document);
        assertEquals(0, nodeList.getLength());
    }

}