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

public class GeneratedWordWrapReaderWriter {

    @Test
    public void wordWrapReaderWriter() throws IOException {
        String text = "This is a long text that needs to be wrapped.";
        String[] lines = text.split("\n");

        Preconditions.checkState(lines.length > 0, "Text must contain at least one line.");
        Preconditions.checkState(new WordWrap.Builder().from(text).wordWrap(new FileWriter("output.txt"), null, "\n", null, x -> x.toLong(), new HashSet<>(), false, true).isComplete(), "Builder is not complete");

        File outputFile = new File("output.txt");
        assertTrue(outputFile.exists());
    }

}