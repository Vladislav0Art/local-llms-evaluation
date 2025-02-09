package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedCloseTest {

    @Test
    public void closeTest() throws IOException {
        Reader readerMock = Mockito.mock(Reader.class);
        WordWrap.close(readerMock);
        Mockito.verify(readerMock).close();
    }

}