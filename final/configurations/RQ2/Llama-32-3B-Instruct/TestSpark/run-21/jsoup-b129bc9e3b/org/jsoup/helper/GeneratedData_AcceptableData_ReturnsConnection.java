package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedData_AcceptableData_ReturnsConnection {

    @Test
    public void data_AcceptableData_ReturnsConnection() {
        Connection conn = Connection.data("key=value");
        assertNotNull(conn);
    }
}

}