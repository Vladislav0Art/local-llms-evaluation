package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim(" This is a unit test   ");
        assertEquals(" This is a unit test", result.toString());
    }

}