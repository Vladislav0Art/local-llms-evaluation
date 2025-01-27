package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedUpdateMetaCharsetElementWorksCorrectly {

    @Test
    public void updateMetaCharsetElementWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        boolean result = document.updateMetaCharsetElement();
        assertTrue(result);
    }

}