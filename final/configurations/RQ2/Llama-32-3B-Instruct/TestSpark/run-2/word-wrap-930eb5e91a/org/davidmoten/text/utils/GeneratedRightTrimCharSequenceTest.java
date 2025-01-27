package org.davidmoten.text.utils;

import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

public class GeneratedRightTrimCharSequenceTest {

    @Test
    public void rightTrimCharSequenceTest() {
        String s = "   Hello World  ";
        Preconditions.assertState(WordWrap.rightTrim(s), String.class, !s.equals(WordWrap.rightTrim(s)));
    }

}