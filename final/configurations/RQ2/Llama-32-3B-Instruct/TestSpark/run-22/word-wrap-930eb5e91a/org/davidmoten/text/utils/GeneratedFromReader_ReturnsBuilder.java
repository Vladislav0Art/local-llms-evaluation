package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedFromReader_ReturnsBuilder {

    @Test
    public void fromReader_ReturnsBuilder() {
        Reader reader = new BufferedReader(new FileReader("test.txt"));
        assertTrue(WordWrap.from(reader) instanceof Builder);
    }

}