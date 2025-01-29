package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;

import java.io.BufferedReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class GeneratedTestClasspathWordWrap {

    @VisibleForTesting
    public static int minMaxWidth(int min, int max) {
        return Math.min(min, max);
    }

    @Test
    public void TestClasspathWordWrap() {
        Preconditions.checkArgument(WordWrap.minMaxWidth(50, 150), "Minimum maximum width is 50 and maximum is 150");

        // Test with different encodings
        Reader reader = new BufferedReader(new StringReader("resource.txt"));
        System.out.println(WordWrap.fromClasspath(reader, StandardCharsets.UTF_8));
    }

}