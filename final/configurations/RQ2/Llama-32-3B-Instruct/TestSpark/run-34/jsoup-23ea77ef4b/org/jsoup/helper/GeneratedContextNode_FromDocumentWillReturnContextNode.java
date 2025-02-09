package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedContextNode_FromDocumentWillReturnContextNode {

    @Test
    public void contextNode_FromDocumentWillReturnContextNode() {
        Document doc = new Document();
        return (Element) W3CDom.contextNode(doc);
    }

}