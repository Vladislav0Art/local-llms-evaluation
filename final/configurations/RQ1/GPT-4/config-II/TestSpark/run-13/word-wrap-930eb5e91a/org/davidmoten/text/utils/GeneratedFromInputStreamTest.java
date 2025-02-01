package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);

        WordWrap.fromUtf8(byteArrayInputStream);
    }

}