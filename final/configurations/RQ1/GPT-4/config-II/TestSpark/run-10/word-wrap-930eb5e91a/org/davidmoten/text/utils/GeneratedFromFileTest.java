package org.davidmoten.text.utils;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() throws FileNotFoundException {
        File file = new File("./src/test/resources/file.txt");
        Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}