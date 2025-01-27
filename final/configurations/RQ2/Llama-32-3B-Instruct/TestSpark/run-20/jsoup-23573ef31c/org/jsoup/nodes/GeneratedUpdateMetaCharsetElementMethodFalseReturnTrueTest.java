package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedUpdateMetaCharsetElementMethodFalseReturnTrueTest {

    @Test
    public void updateMetaCharsetElementMethodFalseReturnTrueTest() {
        Document document = Document.createShell("https://www.example.com");
        boolean result = document.updateMetaCharsetElement();
        assertTrue(result);
    }

}