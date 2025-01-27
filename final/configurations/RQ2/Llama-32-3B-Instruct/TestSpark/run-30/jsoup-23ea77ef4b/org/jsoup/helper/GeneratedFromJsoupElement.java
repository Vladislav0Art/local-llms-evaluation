package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedFromJsoupElement {

    @Test
    public void fromJsoupElement() {
        Element element = org.jsoup.nodes.Document.parse("<div>Hello World!</div>").getElementsByTag("div").first();
        Document convertedDoc = W3CDom.fromJsoup(element);
        assertNotNull(convertedDoc.getDocumentElement());
    }

}