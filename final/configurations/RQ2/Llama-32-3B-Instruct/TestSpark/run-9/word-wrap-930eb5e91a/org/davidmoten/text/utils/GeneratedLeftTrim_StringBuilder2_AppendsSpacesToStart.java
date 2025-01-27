package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedLeftTrim_StringBuilder2_AppendsSpacesToStart {

    @Test
    public void leftTrim_StringBuilder2_AppendsSpacesToStart() {
        StringBuilder word = new StringBuilder();
        WordWrap.leftTrim(word);
        org.junit.Assert.assertEquals("  ", word.toString());
    }

}