package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedSelectXpath {

    @Test
    public void selectXpath() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html><body><div>Hello World!</div></body></html>".getBytes()));
        NodeList nodeList = W3CDom.selectXpath("//div", document);
        assertEquals(1, nodeList.getLength());
    }

}