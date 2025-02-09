package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence s = " test ";
        CharSequence result = WordWrap.rightTrim(s);
        assertEquals(" test", result.toString());
    }

}