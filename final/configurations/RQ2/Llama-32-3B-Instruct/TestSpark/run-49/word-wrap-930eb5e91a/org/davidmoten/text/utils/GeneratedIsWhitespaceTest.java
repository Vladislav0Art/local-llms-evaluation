package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        CharSequence s = " ";
        Preconditions.assertTrue(WordWrap.isWhitespace(s));
        s = "\t";
        Preconditions.assertTrue(WordWrap.isWhitespace(s));
    }

}