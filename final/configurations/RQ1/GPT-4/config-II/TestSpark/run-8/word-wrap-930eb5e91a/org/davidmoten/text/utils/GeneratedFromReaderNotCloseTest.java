package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedFromReaderNotCloseTest {

    @Test
    public void fromReaderNotCloseTest() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/test/resources/test.txt")));
        WordWrap.from(reader);
        Assert.assertTrue(reader.ready());
    }

}