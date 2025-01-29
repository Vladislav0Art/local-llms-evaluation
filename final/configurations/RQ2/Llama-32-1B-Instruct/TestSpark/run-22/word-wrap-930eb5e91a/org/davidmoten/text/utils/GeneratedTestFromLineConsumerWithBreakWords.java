package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestFromLineConsumerWithBreakWords {

    @Test
    public void testFromLineConsumerWithBreakWords() {
        StringBuilder word = new StringBuilder();
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(new BufferedReader(new InputStreamReader(System.in)), System.out, 10, (s) -> s.split("\n"), (s) -> s.split("\\s+"), null, true, false).split("\n");
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            word.append("x").append(line);
            lines.add(word.toString());
            word.setLength(0);
        }
    }

}