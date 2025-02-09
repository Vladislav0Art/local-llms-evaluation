package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedConvert_FromJsoup_Document {

    @Test
    public void convert_FromJsoup_Document() throws Exception {
        Document inDoc = new Document();
        Document outDoc = W3CDom.convert(inDoc);
        assertNotNull(outDoc);
    }

}