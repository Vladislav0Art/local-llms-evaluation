package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence s = "Hello World";
        Preconditions.assertEquals("World", WordWrap.rightTrim(s));
    }

}