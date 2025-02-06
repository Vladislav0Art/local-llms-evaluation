package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedConvertDocumentConvertTest {

    @Test
    public void convertDocumentConvertTest() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        StringWriter sw = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(new DOMSource(doc()), new StreamResult(sw));
        String result = sw.toString();
        assertEquals(result, W3CDom.convert(W3CDom.fromJsoup(new Document())).asString(null));
    }

}