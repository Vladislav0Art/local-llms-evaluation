package org.davidmoten.text.utils;

import static org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedTestHashSet {

    @Test
    public void testHashSet() {
        Set<Character> extraWordChars = new HashSet<>();
        assertEquals(0, extraWordChars.size());
        extraWordChars.add(' ');
        assertEquals(1, extraWordChars.size());
    }

}