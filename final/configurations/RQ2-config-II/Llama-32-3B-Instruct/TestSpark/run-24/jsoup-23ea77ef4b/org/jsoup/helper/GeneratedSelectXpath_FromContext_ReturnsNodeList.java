package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedSelectXpath_FromContext_ReturnsNodeList {

    @Test
    public void selectXpath_FromContext_ReturnsNodeList() {
        Document doc = new Document();
        NodeList out = W3CDom.selectXpath("/body", doc);
        assertNotNull(out);
    }

}