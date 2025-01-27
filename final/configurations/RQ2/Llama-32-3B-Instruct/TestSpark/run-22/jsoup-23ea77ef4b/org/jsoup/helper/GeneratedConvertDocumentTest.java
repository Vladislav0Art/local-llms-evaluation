package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() throws Exception {
        org.jsoup.nodes.Document soup = org.jsoup.Selector.select("*").first();
        Document doc = W3CDom.convert(soup);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.transform(new DOMSource(doc), new StreamResult(outContent));
        String output = outContent.toString();
        assertTrue(output.contains("<html>"));
    }

}