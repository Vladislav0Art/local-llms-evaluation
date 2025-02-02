package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedCreateTextFromEncoded_NoOutput_ThenReturnTextNodeWithCorrectValue {

    @Test
    public void createTextFromEncoded_NoOutput_ThenReturnTextNodeWithCorrectValue() {
        TextNode result = TextNode.createFromEncoded("&lt;Hello World&gt;");
        assertNotNull(result);
        assertEquals("Hello World", result.text());
    }

}