package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGet_NullValueReturnsNull {

    @Test
    public void get_NullValueReturnsNull() {
        Attributes attributes = new Attributes();
        assertEquals(null, attributes.get("key").replaceFirst("^\\s+", ""));
    }

}