package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedFromReaderNullTest {

    @Test
    public void fromReaderNullTest() {
        WordWrap.from((Reader) null);
    }

}