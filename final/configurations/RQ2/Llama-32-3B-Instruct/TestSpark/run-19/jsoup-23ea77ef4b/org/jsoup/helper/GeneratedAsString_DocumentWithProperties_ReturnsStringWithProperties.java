package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedAsString_DocumentWithProperties_ReturnsStringWithProperties {

    @Test
    public void asString_DocumentWithProperties_ReturnsStringWithProperties() throws ParserConfigurationException, TransformerException {
        Properties properties = new Properties();
        properties.put("property", "value");
        Document doc = new Document();
        StringWriter writer = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, Syntax);
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        String result = W3CDom.asString(doc, properties);
        assertNotNull(result);
        assertTrue(result.contains("property=value"));
    }

}