package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestParseSettingsPreserveCase {

    @Test
    public void testParseSettingsPreserveCase() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File("/path/to/test.html"));

        ParseSettings settings = document.getSettings();
        assertEquals(ParseSettings.PRESERVE_CASE, settings);
    }

}