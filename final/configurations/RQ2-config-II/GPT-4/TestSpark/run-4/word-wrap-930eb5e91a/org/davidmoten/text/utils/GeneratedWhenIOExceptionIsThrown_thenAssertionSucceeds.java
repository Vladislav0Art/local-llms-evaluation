package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedWhenIOExceptionIsThrown_thenAssertionSucceeds {

    @Test
    public void whenIOExceptionIsThrown_thenAssertionSucceeds() throws IOException {
        WordWrap.wordWrap(null, null, null, null, null, null, false, false);
    }
}

}