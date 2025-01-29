package org.davidmoten.text.utils;

public class GeneratedTestFromClasspathUtf8 {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Test
    public void testFromClasspathUtf8() throws IOException {
        Writer writer = WordWrap.fromClasspathUtf8(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        String input = "Hello\nWorld";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n' && i + 1 < input.length()) {
                int nextCharCount = WordWrap.wordWrap(reader, writer, "\n", 100, null, null, false, false).length;
                output.append(c);
                output.append(' ');
                for (int j = 0; j < nextCharCount - 1; j++) {
                    output.append(c);
                }
            } else {
                output.append(c);
            }
        }

        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, WordWrap.fromClasspathUtf8(new InputStreamReader(System.in, StandardCharsets.UTF_8)).toString());
    }

}