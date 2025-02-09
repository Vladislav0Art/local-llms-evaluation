package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedConvert_FromDocument_ToDocument {

    @Test
    public void convert_FromDocument_ToDocument() throws Exception {
        Document inDoc = new Document();
        Document outDoc = new Document();
        W3CDom.convert(inDoc, outDoc);
        assertEquals(0, outDoc.nodes().size());
    }

}