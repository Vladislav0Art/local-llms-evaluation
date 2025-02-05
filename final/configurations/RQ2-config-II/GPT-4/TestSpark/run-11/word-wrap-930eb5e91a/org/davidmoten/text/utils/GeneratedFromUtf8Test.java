package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() throws FileNotFoundException {
        File file = new File("testFile");
        InputStream in = new FileInputStream(file);
        assertNotNull(WordWrap.fromUtf8(in));
    }

}