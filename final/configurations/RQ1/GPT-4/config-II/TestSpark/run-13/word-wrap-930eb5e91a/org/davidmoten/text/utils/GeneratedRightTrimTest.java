package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim(" test  ");

        assertEquals(" test", result.toString());
    }

}