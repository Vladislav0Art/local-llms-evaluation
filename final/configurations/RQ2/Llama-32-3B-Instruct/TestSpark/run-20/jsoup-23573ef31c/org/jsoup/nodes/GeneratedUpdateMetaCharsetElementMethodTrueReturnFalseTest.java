package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedUpdateMetaCharsetElementMethodTrueReturnFalseTest {

    @Test
    public void updateMetaCharsetElementMethodTrueReturnFalseTest() {
        Document document = Document.createShell("https://www.example.com");
        boolean result = document.updateMetaCharsetElement(true);
        assertFalse(result);
    }

}