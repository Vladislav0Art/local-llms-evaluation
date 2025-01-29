package org.davidmoten.text.utils;

import org.davidmoten.text.utils.*;

public class GeneratedTestWordWrapWithExtraWordCharsInsertHyphens {

    @Test
    public void testWordWrapWithExtraWordCharsInsertHyphens() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder word = new StringBuilder();
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(reader, 10, (s) -> s.split("\n"), (s) -> s + "-", null, new HashSet<>(), true, false);
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            word.append(line);
            lines.add(word.toString());
            word.setLength(0);
        }
        System.out.println(String.join("\n", lines));
    }

}