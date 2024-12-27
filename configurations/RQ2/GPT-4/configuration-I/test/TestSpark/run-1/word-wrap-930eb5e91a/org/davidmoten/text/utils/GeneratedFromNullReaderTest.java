package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class GeneratedFromNullReaderTest {

    @Test
    public void fromNullReaderTest() {
        WordWrap.from(null);
    }

}