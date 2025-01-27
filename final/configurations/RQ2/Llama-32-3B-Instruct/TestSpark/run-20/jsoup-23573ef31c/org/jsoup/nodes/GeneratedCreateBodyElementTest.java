package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateBodyElementTest {

    @Test
    public void createBodyElementTest() {
        Document document = Document.createShell("https://www.example.com");
        Element body = document.body();
        assertNotNull(body);
    }

}