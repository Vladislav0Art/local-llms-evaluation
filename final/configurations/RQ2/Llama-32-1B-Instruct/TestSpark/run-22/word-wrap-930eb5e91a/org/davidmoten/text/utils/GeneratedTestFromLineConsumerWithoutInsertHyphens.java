package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestFromLineConsumerWithoutInsertHyphens {

    @Test
    public void testFromLineConsumerWithoutInsertHyphens() {
        StringBuilder word = new StringBuilder();
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(new BufferedReader(new InputStreamReader(System.in)), System.out, 10, null, (s) -> s.split("\n"), new HashSet<>(), false, true).split("\n");
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            word.append("x").append(line);
            lines.add(word.toString());
            word.setLength(0);
        }
        assertTrue(lines.get(lines.size() - 1).startsWith("xx"));
    }

}