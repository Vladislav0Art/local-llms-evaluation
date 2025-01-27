package org.davidmoten.text.utils;

import static org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedTestCharSet {

    @Test
    public void testCharSet() {
        CharacterSet extraWordChars = new CharacterSet();
        assertEquals(0, extraWordChars.getExtraWordChars().size());
        extraWordChars.getExtraWordChars().add(' ');
        assertEquals(1, extraWordChars.getExtraWordChars().size());
    }

}