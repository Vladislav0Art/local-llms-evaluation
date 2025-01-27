package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedSelectXpathStringDocument_ReturnsNodeList {

    @Test
    public void selectXpathStringDocument_ReturnsNodeList() {
        Document doc = null;
        NodeList nodeList = W3CDom.selectXpath("test", doc);
        assertNotNull(nodeList);
    }

}