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
public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        String baseUri = "https://example.com";
        assertNull(Document.createShell(baseUri).location());
    }

}