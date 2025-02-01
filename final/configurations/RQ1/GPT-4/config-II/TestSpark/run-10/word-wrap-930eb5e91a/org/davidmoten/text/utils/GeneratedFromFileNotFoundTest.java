package org.davidmoten.text.utils;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromFileNotFoundTest {

    @Test
    public void fromFileNotFoundTest() {
        File file = new File("fileNotFound.txt");
        Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);
    }

}