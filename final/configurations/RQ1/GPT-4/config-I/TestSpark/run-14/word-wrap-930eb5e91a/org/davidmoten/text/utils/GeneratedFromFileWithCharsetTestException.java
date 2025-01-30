package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;

public class GeneratedFromFileWithCharsetTestException {

    @Test
    public void fromFileWithCharsetTestException() {
        File nonExistentFile = Mockito.mock(File.class);
        Mockito.when(nonExistentFile.exists()).thenReturn(false);
        WordWrap.from(nonExistentFile, StandardCharsets.UTF_8);
    }

}