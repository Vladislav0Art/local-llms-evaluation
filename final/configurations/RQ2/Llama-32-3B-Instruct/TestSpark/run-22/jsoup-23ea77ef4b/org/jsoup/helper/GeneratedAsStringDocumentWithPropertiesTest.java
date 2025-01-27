package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsStringDocumentWithPropertiesTest {

    @Test
    public void asStringDocumentWithPropertiesTest() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        doc.appendChild(doc.createElement("div", null, null));
        assertEquals("<div></div>", W3CDom.asString(doc, new HashMap<String, String>() {{
            put("xml:space", "preserve");
        }}));
    }

}