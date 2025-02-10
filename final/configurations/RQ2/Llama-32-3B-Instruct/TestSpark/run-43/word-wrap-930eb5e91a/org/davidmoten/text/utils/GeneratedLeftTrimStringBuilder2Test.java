package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedLeftTrimStringBuilder2Test {

    @Test
    public void leftTrimStringBuilder2Test() {
        StringBuilder word = new StringBuilder("   test   ");
        WordWrap.leftTrim(word);
        assertEquals("test", word.toString());
    }

}