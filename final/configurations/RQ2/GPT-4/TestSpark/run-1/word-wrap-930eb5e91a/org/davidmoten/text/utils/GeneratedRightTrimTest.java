package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.io.StringReader;
import java.io.StringWriter;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim(" test  ");
        assertEquals(" test", result);
    }

}