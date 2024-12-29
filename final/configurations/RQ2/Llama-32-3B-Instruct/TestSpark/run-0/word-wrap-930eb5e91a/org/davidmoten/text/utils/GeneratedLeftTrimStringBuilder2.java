package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

public class GeneratedLeftTrimStringBuilder2 {

    @Test
    public void leftTrimStringBuilder2() {
        StringBuilder word = new StringBuilder();
        Preconditions.checkState(WordWrap.leftTrim(word), "Method must be called at least once.");
    }

}