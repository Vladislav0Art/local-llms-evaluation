package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedUpdateMetaCharsetElement_updateMetaCharsetElementMethodUpdatesMetaCharsetCorrectly {

    @Test
    public void updateMetaCharsetElement_updateMetaCharsetElementMethodUpdatesMetaCharsetCorrectly() {
        boolean expectedUpdate = true;
        Document document = Document.createShell("https://www.example.com");
        document.updateMetaCharsetElement(expectedUpdate);
        assertTrue(document.updateMetaCharsetElement());
    }

}