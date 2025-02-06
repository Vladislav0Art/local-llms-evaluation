package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedParser_ValidContent_ReturnsParser {

    @Test
    public void parser_ValidContent_ReturnsParser() {
        MockParser mockParser = new MockParser();
        Document document = Document.createShell("");
        document.parser(mockParser);
        assertEquals("Mock Content", mockParser.getContent());
    }
}

public class OutputSettingsTest {

    private static class MockOutputSettings extends OutputSettings {
        @Override
        public void setCharset(Charset charset) {
            // Do nothing
        }

        @Override
        public Charset getCharset() {
            return null;
        }
    }

}