package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromReader {

    @Mock
    private Reader reader;

    @Mock
    private LineConsumer lineConsumer;

    @Mock
    private File file;

    @Test
    public void fromReader() {
        when(reader.read()).thenReturn(0);
        when(reader.readLine()).thenReturn("");
        assertEquals(WordWrap.Builder.from(reader), WordWrap.Builder.empty());
    }

}