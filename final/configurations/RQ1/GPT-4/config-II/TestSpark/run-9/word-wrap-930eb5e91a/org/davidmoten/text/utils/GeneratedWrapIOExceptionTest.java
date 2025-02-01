package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class GeneratedWrapIOExceptionTest {

    @Test
    public void wrapIOExceptionTest() throws Exception {
        StringReader reader = new StringReader("test");
        WordWrap.from(reader).wrap((File) null, null);
    }

}