package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedCreateTextNode BlankSpaceOnly_ThenReturnBlankSpaces {

    @Test
    public void createTextNode

    BlankSpaceOnly_ThenReturnBlankSpaces() {
        TextNode textNode = new TextNode("   ");
        assertEquals("   ", textNode.text());
    }

}