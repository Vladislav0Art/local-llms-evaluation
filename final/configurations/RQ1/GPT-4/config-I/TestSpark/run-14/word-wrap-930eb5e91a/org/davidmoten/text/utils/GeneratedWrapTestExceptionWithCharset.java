package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;

public class GeneratedWrapTestExceptionWithCharset {

    @Test
    public void wrapTestExceptionWithCharset() {
        WordWrap.Builder builder = WordWrap.from("This is a normal text");
        File mockFile = Mockito.mock(File.class);
        Mockito.when(mockFile.exists()).thenReturn(true);
        Mockito.when(mockFile.canWrite()).thenReturn(true);
        builder.wrap(mockFile, StandardCharsets.UTF_8);
    }

}