package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedIsBlank_TextIsBlank_ThenReturnTrue {

    @Test
    public void isBlank_TextIsBlank_ThenReturnTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}