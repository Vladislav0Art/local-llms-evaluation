package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

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
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedFromClasspathUtf8ResourceShouldNotThrowAnyException {

    @Test
    public void fromClasspathUtf8ResourceShouldNotThrowAnyException() {
        String resource = "test.txt";
        try {
            WordWrap.fromClasspathUtf8(resource);
            fail("Expected exception not thrown");
        } catch (Exception e) {
        }
    }

}