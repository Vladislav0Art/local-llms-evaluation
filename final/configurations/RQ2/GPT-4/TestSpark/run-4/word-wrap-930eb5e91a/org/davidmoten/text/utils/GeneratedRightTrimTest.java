package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence original = "   Hello, world!   ";
        CharSequence trimmed = WordWrap.rightTrim(original);
        assertEquals("   Hello, world!", trimmed.toString());
    }

}