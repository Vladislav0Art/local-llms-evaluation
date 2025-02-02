package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class GeneratedIsBlank_MethodReturnsFalseForNormalisedWhitespace {

    @Test
    public void isBlank_MethodReturnsFalseForNormalisedWhitespace() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}