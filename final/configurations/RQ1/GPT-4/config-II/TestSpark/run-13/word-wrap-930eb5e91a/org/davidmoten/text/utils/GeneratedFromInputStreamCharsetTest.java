package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);

        WordWrap.from(byteArrayInputStream, null);
    }

}