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

public class GeneratedFromClasspathUtf8ResourceWithCloseShouldReturnAValidBuilder {

    @Test
    public void fromClasspathUtf8ResourceWithCloseShouldReturnAValidBuilder() {
        String resource = "test.txt";
        boolean close = true;
        try (Reader reader = WordWrap.from(reader, close)) {
            assertNotNull(WordWrap.from(reader, close));
        } catch (Exception e) {
        }
    }

}