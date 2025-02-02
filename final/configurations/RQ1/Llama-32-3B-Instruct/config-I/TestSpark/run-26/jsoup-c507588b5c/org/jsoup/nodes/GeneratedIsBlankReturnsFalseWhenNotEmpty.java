package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GeneratedIsBlankReturnsFalseWhenNotEmpty {

    @Test
    public void isBlankReturnsFalseWhenNotEmpty() {
        String text = "test";
        assertTrue(LeafNode.isBlank(text));
    }

}