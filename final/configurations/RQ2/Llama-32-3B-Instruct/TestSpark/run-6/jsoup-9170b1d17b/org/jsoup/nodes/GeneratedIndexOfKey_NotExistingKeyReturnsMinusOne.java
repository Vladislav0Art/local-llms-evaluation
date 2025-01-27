package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIndexOfKey_NotExistingKeyReturnsMinusOne {

    @Test
    public void indexOfKey_NotExistingKeyReturnsMinusOne() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("notExisting"));
    }

}