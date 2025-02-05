package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertFromDocumentTest {

    @Test
    public void convertFromDocumentTest() {
        Document document = new Document("Test Title");
        assertNotNull(W3CDom.convert(document));
    }

}