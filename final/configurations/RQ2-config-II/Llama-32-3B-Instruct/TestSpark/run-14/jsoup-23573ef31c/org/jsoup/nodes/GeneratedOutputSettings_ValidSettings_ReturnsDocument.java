package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedOutputSettings_ValidSettings_ReturnsDocument {

    @Test
    public void outputSettings_ValidSettings_ReturnsDocument() {
        MockOutputSettings mockOutputSettings = new MockOutputSettings();
        Document document = Document.createShell("");
        document.outputSettings(mockOutputSettings);
        assertNotNull(document.charset());
        assertEquals(mockOutputSettings.getCharset(), document.charset());
    }
}

public class QuirksModeTest {

    private static class MockQuirksMode extends QuirksMode {
        @Override
    }

}