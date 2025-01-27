package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromClasspathUtf8ResourceTest {

    @Mock
    private Reader reader;

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("WordWrapTest");
    }

    @Test
    public void fromClasspathUtf8ResourceTest() {
        when(reader.readLine()).thenReturn("test").thenReturn(null);
        String resource = "test";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        Preconditions.checkState(builder != null, "Builder should not be null");
    }

}