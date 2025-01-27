package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedIsWhitespaceReturnsFalseForNonWhitespaceChar {

    @Test
    public void isWhitespaceReturnsFalseForNonWhitespaceChar() {
        CharSequence s = "H";
        Preconditions.checkState(!isWhitespace(s));
    }
}

}