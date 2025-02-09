package org.davidmoten.text.utils;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim(" Hello World  ");
        assertEquals(" Hello World", result.toString());
    }

}