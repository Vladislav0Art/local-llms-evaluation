package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestFromLineConsumerWithExtraWordChars {

    @Test
    public void testFromLineConsumerWithExtraWordChars() {
        StringBuilder word = new StringBuilder();
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(new BufferedReader(new InputStreamReader(System.in)), System.out, 10, (s) -> s.split("\n"), (s) -> s + "-", null, new HashSet<>(), false, true).split("\n");
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            word.append("x").append(line);
            lines.add(word.toString());
            word.setLength(0);
        }
    }

}