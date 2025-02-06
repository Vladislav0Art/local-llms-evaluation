package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedClone_CloneCreatesNewTextNode {

    @Test
    public void clone_CloneCreatesNewTextNode() {
        TextNode original = new TextNode("abcdefg");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertNotSame(original, cloned);
    }

}