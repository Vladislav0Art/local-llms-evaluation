package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromReaderTest {

    @Mock
    private Reader mockReader;

    @Mock
    private Writer mockWriter;

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(mockReader));
    }

}