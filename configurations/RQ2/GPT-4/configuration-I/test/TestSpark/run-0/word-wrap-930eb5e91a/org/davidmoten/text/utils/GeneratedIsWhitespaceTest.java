package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsWhitespaceTest {

    @Mock
    Reader reader;

    @Mock
    Writer writer;

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
        assertFalse(WordWrap.isWhitespace("A"));
    }

}