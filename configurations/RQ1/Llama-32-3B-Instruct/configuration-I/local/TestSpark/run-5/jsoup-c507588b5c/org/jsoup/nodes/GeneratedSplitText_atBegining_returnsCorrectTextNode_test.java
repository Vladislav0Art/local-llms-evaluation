package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSplitText_atBegining_returnsCorrectTextNode_test {

    @Test
    public void splitText_atBegining_returnsCorrectTextNode_test() {
        String text = "Hello World!";
        int offset = 0;
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);
        assertEquals(text, result.text());
    }

}