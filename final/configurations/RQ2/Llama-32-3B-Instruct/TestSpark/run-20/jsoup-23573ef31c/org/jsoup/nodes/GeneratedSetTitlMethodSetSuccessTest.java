package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedSetTitlMethodSetSuccessTest {

    @Test
    public void setTitlMethodSetSuccessTest() {
        Document document = Document.createShell("https://www.example.com");
        document.title("Title Test");
        String finalTitle = document.title();
        assertEquals("Title Test", finalTitle);
    }

}