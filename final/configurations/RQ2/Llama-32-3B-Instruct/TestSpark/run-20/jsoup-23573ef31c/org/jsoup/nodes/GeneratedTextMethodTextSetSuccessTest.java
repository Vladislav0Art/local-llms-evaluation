package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTextMethodTextSetSuccessTest {

    @Test
    public void textMethodTextSetSuccessTest() {
        Document document = Document.createShell("https://www.example.com");
        document.text("Some Text Test");
        String finalText = document.text();
        assertEquals("Some Text Test", finalText);
    }

}