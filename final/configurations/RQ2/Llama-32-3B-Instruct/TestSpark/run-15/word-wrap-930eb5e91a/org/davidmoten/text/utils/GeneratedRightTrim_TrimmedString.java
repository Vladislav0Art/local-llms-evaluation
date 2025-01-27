package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedRightTrim_TrimmedString {

    @Test
    public void rightTrim_TrimmedString() {
        assertEquals(" World", WordWrap.rightTrim("Hello World"));
    }

}