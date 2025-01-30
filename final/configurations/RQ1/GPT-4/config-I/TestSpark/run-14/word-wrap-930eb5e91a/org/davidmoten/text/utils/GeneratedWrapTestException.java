package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;

public class GeneratedWrapTestException {

    @Test
    public void wrapTestException() throws IOException {
        Writer writer = Mockito.mock(Writer.class);
        Mockito.doThrow(new IOException()).when(writer).write(Mockito.anyString(), Mockito.anyInt(), Mockito.anyInt());
        WordWrap.from("This is a normal text").wrap(writer);
    }

}