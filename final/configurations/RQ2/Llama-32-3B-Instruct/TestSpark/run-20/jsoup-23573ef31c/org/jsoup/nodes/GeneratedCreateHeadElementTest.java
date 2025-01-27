package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateHeadElementTest {

    @Test
    public void createHeadElementTest() {
        Document document = Document.createShell("https://www.example.com");
        Element head = document.head();
        assertNotNull(head);
    }

}