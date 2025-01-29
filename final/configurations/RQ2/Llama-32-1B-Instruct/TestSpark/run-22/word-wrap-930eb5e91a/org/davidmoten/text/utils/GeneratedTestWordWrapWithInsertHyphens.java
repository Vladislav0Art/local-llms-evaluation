package org.davidmoten.text.utils;

import org.davidmoten.text.utils.*;

public class GeneratedTestWordWrapWithInsertHyphens {

    @Test
    public void testWordWrapWithInsertHyphens() {
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(new BufferedReader(new InputStreamReader(System.in)), 10, (s) -> s.split("\n"), (s) -> s + "-", null, new HashSet<>(), true, false);
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            lines.add(line);
            lines.get(lines.size() - 1).append("x");
        }
        System.out.println(String.join("\n", lines));
    }

}