package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedIsBlank_TextIsEmptyButNotBlank_ThenReturnFalse {

    @Test
    public void isBlank_TextIsEmptyButNotBlank_ThenReturnFalse() {
        TextNode textNode = new TextNode(" ");
        assertFalse(textNode.isBlank());
    }

}