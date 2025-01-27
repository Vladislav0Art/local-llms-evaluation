package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

public class GeneratedIsWhitespace_returnsFalseForNonWhitespaceCharacter {

    @Test
    public void isWhitespace_returnsFalseForNonWhitespaceCharacter() {
        assertFalse(WordWrap.isWhitespace("\u0009"));
    }

}