package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedIsWhitespace_AnySpaceReturnsTrue {

    @Test
    public void isWhitespace_AnySpaceReturnsTrue() {
        assertTrue(WordWrap.isWhitespace("   "));
    }

}