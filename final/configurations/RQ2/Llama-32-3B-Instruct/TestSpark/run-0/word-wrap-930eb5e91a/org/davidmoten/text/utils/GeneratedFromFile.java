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

public class GeneratedFromFile {

    @Test
    public void fromFile() {
        Preconditions.checkState(new WordWrap.Builder().from(new File("test.txt"), StandardCharsets.UTF_8).isComplete(), "Builder is not complete");
    }

}