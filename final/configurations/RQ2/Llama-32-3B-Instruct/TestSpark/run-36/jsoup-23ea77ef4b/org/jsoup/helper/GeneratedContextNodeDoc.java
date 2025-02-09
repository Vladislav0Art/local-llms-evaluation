package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNodeDoc {

    @Test
    public void contextNodeDoc() {
        Document wDoc = new Document();
        Node result = W3CDom.contextNode(wDoc);
        assertTrue(result instanceof Comment);
    }

}