package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetIgnoreCase_NullValueReturnsNull {

    @Test
    public void getIgnoreCase_NullValueReturnsNull() {
        Attributes attributes = new Attributes();
        assertEquals(null, attributes.getIgnoreCase(""));
    }

}