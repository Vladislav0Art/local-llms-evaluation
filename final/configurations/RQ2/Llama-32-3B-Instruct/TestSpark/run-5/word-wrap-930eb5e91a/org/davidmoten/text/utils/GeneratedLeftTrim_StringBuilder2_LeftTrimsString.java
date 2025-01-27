package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLeftTrim_StringBuilder2_LeftTrimsString {

    @Mock
    private Reader reader;

    public static class Builder {
        // implementation
    }

    @Test
    public void leftTrim_StringBuilder2_LeftTrimsString() {
        StringBuilder2 word = mock(StringBuilder2.class);
        WordWrap.leftTrim(word);
        verify(word, times(1)).setCharAt(0, ' ');
    }

}