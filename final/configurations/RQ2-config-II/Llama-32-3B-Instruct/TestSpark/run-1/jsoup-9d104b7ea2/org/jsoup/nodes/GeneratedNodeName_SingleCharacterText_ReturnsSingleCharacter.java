package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedNodeName_SingleCharacterText_ReturnsSingleCharacter {

    @Test
    public void nodeName_SingleCharacterText_ReturnsSingleCharacter() {
        TextNode textNode = new TextNode("a");
        assertEquals("a", textNode.nodeName());
    }

}