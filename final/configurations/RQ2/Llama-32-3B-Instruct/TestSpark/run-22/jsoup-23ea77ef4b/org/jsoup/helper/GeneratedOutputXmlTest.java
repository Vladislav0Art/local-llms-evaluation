package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOutputXmlTest {

    @Test
    public void OutputXmlTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        HashMap<String, String> properties = W3CDom.OutputXml();
        assertEquals(StringUtil.toString(div), W3CDom.asString(doc));
    }

}