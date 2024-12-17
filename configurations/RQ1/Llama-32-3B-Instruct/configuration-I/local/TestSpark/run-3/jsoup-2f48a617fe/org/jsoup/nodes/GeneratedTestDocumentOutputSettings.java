package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestDocumentOutputSettings {

    @Test
    public void testDocumentOutputSettings() {
        Document document = new Document();
        document.setOutputSettings(new OutputSettings());
        assertTrue(document.getOutputSettings().toString().contains("<!--"));
        assertFalse(document.getOutputSettings().toString().contains("-->"));
    }

}