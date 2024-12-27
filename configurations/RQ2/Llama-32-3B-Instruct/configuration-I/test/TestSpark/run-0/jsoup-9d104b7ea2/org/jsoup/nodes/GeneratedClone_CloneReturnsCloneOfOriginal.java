package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedClone_CloneReturnsCloneOfOriginal {

    @Test
    public void clone_CloneReturnsCloneOfOriginal() {
        String text = "Hello, World!";
        TextNode original = new TextNode(text);
        TextNode clone = original.clone();
        assertEquals(original, clone);
    }

}