package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpath_XpathReturnsNodeList {

    @Test
    public void selectXpath_XpathReturnsNodeList() {
        Document doc = new Document();
        NodeList nodeList = W3CDom.selectXpath("xpath", doc);
        assertNotNull(nodeList);
    }

}