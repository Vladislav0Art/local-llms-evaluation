package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedOutputSettingsMethodEmptyDocumentTest {

    @Test
    public void outputSettingsMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        OutputSettings settings = document.outputSettings();
        assertTrue(settings == null || settings.isEmpty());
    }

}