package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        org.w3c.dom.Document w3cDocument = getEmptyW3cDocument();
        String result = W3CDom.asString(w3cDocument);
        assertNotNull(result);
    }

}