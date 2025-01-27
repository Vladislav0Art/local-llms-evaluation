package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOutputHtmlTest {

    @Test
    public void OutputHtmlTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        HashMap<String, String> properties = W3CDom.OutputHtml();
        assertEquals(StringUtil.toString(div), W3CDom.asString(doc, new HashMap<String, String>() {{
            put("xml:space", "preserve");
        }}));
    }

}