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

public class GeneratedFromJsoupDocumentNotNullParameterTest {

    @Test
    public void fromJsoupDocumentNotNullParameterTest() throws Exception {
        org.jsoup.nodes.Document document = ...; // create valid JSoup document
        W3CDom w3cDom = new W3CDom();
        assertNotNull(w3cDom.fromJsoup(document));
    }

}