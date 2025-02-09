package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        assertEquals("Hello  ", WordWrap.rightTrim("Hello  World"));
        assertEquals("Hello", WordWrap.rightTrim("Hello"));
    }

}