package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class GeneratedCreateTextNode_Newline {

    @Test
    public void createTextNode_Newline() {
        String text = "\n";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.value());
        assertEquals("\n", textNode.getWholeText());
    }

}