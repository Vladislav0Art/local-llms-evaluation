package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class GeneratedTestParser {

    private HttpConnection connection;

    @BeforeEach
    public void setUp() {
        connection = new HttpConnection();
    }

    @Test
    public void testParser() {
        assertNotNull(connection.parser());

        connection.parser(new Parser() {
            @Override
            public Document parseInput(String input, String baseUri) {
                return null;
            }
        });
        assertNotNull(connection.parser());
    }

}