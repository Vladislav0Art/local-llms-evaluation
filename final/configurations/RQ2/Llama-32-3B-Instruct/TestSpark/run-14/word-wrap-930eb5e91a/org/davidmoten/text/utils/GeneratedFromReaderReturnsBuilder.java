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

public class GeneratedFromReaderReturnsBuilder {

    @Test
    public void fromReaderReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.from(new InputStreamReader(System.in));
        assertNotNull(builder);
    }

}