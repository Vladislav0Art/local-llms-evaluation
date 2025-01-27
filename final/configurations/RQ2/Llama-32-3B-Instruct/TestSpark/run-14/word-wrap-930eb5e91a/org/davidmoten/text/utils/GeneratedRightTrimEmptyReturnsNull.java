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

public class GeneratedRightTrimEmptyReturnsNull {

    @Test
    public void rightTrimEmptyReturnsNull() {
        String input = "";
        String expected = "";
        assertEquals(expected, WordWrap.rightTrim(input));
    }

}