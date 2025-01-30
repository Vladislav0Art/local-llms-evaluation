package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class GeneratedWrapWithIORuntimeExceptionTest {

    @Test
    public void wrapWithIORuntimeExceptionTest() {
        StringWriter sw = new StringWriter();
        WordWrap.from("test").wrap(sw);
    }

}