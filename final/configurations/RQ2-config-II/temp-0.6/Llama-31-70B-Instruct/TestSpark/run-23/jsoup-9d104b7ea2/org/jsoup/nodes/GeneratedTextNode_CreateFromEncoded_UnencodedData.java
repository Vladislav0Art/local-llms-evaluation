package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTextNode_CreateFromEncoded_UnencodedData {

    @Test
    public void textNode_CreateFromEncoded_UnencodedData() {
        TextNode textNode = new TextNode("&lt;");
        String expected = "<";
        String actual = textNode.text();
        assertEquals(expected, actual);
    }

}