package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GeneratedLeftTrimStartsWithTrailingSpace {

    @Test
    public void leftTrimStartsWithTrailingSpace() {
        String input = "   ";
        StringBuilder expected = new StringBuilder(input).replace(0, 1, "");
        assertEquals(expected.toString(), WordWrap.leftTrim(new StringBuilder(input)));
    }

}