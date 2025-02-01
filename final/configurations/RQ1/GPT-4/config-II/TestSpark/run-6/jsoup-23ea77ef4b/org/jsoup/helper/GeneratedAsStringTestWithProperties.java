package org.jsoup.helper;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringTestWithProperties {

    @Test
    public void asStringTestWithProperties() throws ParserConfigurationException, TransformerConfigurationException {
        Document in = new Document("");
        org.w3c.dom.Document out = W3CDom.convert(in);
        Map<String, String> properties = new HashMap<>();
        properties.put("method", "xml");
        properties.put("indent", "yes");
        String output = W3CDom.asString(out, properties);
        assertNotNull(output);
    }

}