package org.davidmoten.text.utils;

import org.davidmoten.text.utils.*;

public class GeneratedTestWordWrapWithExtraWordCharsNoInsertHyphensAndExtraChars {

    @Test
    public void testWordWrapWithExtraWordCharsNoInsertHyphensAndExtraChars() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder word = new StringBuilder();
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(reader, 10, (s) -> s.split("\n"), (s) -> s.split("\\s+"), null, false, true);
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            word.append(line);
            lines.add(word.toString());
            word.setLength(0);
        }
        String[] expected = {"xx"};
        for (String line : splitLines) {
            assertTrue(line.startsWith("xx"));
        }
    }

}