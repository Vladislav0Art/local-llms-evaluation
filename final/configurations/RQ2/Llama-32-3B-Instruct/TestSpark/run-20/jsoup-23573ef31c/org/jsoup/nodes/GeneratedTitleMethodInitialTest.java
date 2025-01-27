package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTitleMethodInitialTest {

    @Test
    public void titleMethodInitialTest() {
        Document document = Document.createShell("https://www.example.com");
        String initialTitle = document.title();
        assertTrue(initialTitle.isEmpty());
    }

}