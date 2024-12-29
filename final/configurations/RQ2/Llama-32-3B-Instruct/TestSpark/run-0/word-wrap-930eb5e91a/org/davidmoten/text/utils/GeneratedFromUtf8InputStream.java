package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

public class GeneratedFromUtf8InputStream {

    @Test
    public void fromUtf8InputStream() {
        Preconditions.checkState(new WordWrap.Builder().fromUtf8(new FileInputStream("test.txt")).isComplete(), "Builder is not complete");
    }

}