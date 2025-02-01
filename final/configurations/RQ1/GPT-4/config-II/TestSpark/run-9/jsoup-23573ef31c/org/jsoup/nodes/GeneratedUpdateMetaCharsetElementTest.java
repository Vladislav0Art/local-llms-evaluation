package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedUpdateMetaCharsetElementTest {

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = Document.createShell("");
        assertFalse(document.updateMetaCharsetElement());
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

}