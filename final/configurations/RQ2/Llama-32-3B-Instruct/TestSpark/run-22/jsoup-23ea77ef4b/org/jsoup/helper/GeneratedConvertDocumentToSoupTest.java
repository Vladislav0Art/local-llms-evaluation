package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedConvertDocumentToSoupTest {

    @Test
    public void convertDocumentToSoupTest() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        org.jsoup.nodes.Document soup = W3CDom.convert(doc);
        assertNotNull(soup.body());
    }

}