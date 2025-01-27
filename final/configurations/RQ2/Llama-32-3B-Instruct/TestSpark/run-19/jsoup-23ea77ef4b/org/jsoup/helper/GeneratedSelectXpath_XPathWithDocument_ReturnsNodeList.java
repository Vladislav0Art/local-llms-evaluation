package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedSelectXpath_XPathWithDocument_ReturnsNodeList {

    @Test
    public void selectXpath_XPathWithDocument_ReturnsNodeList() {
        Document doc = new Document();
        NodeList nodeList = W3CDom.selectXpath("//tag", doc);
        assertNotNull(nodeList);
        assertFalse(nodeList.isEmpty());
    }

}