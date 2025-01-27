package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedExecute_ThrowsIOException {

    @Test
    public void execute_ThrowsIOException() {
        try {
            Connection response = HttpConnection.execute();
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

}