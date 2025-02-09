package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentNotNullParametersTest {

    @Test
    public void convertDocumentNotNullParametersTest() throws Exception {
        org.jsoup.nodes.Document inDocument = ...; // create valid JSoup document
        Document outDocument = ...; // create valid W3C document
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(inDocument, outDocument);
        // verify conversion
    }

}