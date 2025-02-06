package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedAsString_FromDoc_ReturnsString {

    @Test
    public void asString_FromDoc_ReturnsString() {
        Document doc = new Document();
        String out = W3CDom.asString(doc, null);
        assertNotNull(out);
    }

}