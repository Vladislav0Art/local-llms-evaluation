package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedData_StringFilenameInputStreamReturnsWithData {

    @Test
    public void data_StringFilenameInputStreamReturnsWithData() {
        String filename = "filename";
        InputStream inputStream = new ByteArrayInputStream(new byte[]{0});
        Connection connection = HttpConnection.data(filename, inputStream);
        assertNotNull(connection);
    }

}