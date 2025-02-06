package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.ArrayList;

import org.jsoup.Connection;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        String title = "Example Title";
        Document document = Document.createShell("https://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

}