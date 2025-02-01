package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        String html = "<html><head><title>First parse</title></head><body><p>First html</p></body></html>";
        Document jsoupDoc = Document.createShell(html);
        org.w3c.dom.Document doc = W3CDom.convert(jsoupDoc);

        assertNotNull(doc);
        assertEquals("html", doc.getDocumentElement().getTagName());
    }

}