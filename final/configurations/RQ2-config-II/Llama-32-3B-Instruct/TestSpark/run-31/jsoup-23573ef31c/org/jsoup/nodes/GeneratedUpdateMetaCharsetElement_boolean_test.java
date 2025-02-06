package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedUpdateMetaCharsetElement_boolean_test {

    @Test
    public void updateMetaCharsetElement_boolean_test() {
        Document document = Document.createShell("http://example.com");
        boolean update = true;
        document.updateMetaCharsetElement(update);
        assertTrue(document.updateMetaCharsetElement());
    }

}