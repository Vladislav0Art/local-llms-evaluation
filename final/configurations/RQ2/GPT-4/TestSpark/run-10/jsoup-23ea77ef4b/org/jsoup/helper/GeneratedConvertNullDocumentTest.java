package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class GeneratedConvertNullDocumentTest {

    @Test
    public void convertNullDocumentTest() {
        Document document = null;
        W3CDom.convert(document);
    }

}