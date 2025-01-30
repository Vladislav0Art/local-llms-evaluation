package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.mockito.Mockito;

public class GeneratedWrapIOExceptionTest {

    @Test
    public void wrapIOExceptionTest() {
        StringWriter writer = Mockito.spy(new StringWriter());
        try {
            Mockito.doThrow(new IOException()).when(writer).write(Mockito.anyString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        WordWrap.Builder builder = WordWrap.from(new StringReader("hello world"));
        try {
            builder.wrap(writer);
        } catch (Exception e) {
            assertTrue(e instanceof WordWrap.IORuntimeException);
        }
        Mockito.verify(writer, Mockito.times(1)).write("hello world");
    }

}