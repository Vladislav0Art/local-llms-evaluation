package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedContextNode_ReturnsDocument {

    @Test
    public void contextNode_ReturnsDocument() {
        Document wDoc = null;
        Document test = W3CDom.contextNode(wDoc);
        assertNotNull(test);
    }

}