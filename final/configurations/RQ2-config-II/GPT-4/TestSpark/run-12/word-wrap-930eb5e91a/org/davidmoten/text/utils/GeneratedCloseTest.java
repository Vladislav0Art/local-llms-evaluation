package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

public class GeneratedCloseTest {

    @Test
    public void closeTest() {
        BufferedReader reader = Mockito.mock(BufferedReader.class);
        WordWrap.close(reader);
        verify(reader, times(1)).close();
    }

}