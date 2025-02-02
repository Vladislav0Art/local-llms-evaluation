package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedCreateTextNode_TextIsEmpty_ThenReturnEmptyString {

    @Test
    public void createTextNode_TextIsEmpty_ThenReturnEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}