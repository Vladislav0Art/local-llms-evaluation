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
public class GeneratedRightTrimTest {

    @Mock
    Reader reader;

    @Mock
    Writer writer;

    @Test
    public void rightTrimTest() {
        CharSequence text = " This is a test text ";
        assertEquals(" This is a test text", WordWrap.rightTrim(text).toString());
    }

}