package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedFromFileNotFoundTest {

    @Test
    public void fromFileNotFoundTest() {
        File file = new File("nonExistingFile.txt");
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

}