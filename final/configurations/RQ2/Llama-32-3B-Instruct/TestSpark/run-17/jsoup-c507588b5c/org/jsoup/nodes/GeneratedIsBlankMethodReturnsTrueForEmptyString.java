package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlankMethodReturnsTrueForEmptyString {

    @Test
    public void isBlankMethodReturnsTrueForEmptyString() {
        assertTrue(TextNode.createFromEncoded("").isBlank());
    }

}