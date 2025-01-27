package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedRightTrimTrimsWhitespaceFromEnd {

    @Test
    public void rightTrimTrimsWhitespaceFromEnd() {
        CharSequence s = "Hello   World!";
        Preconditions.checkState(rightTrim(s).toString().equals("Hello World!"));
    }

}