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

public class GeneratedFromReaderClose {

    @Test
    public void fromReaderClose() {
        Preconditions.checkState(new WordWrap.Builder().from(new BufferedReader(new FileReader("test.txt"))).close(), "Method must be called at least once.");
    }

}