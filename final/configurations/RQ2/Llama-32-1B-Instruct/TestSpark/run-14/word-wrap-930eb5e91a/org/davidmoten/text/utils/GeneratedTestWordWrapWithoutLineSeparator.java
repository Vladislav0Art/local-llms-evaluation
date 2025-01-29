package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class GeneratedTestWordWrapWithoutLineSeparator {

    private static final String INPUT_FILE = "hello-world.txt";
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final Reader reader = new BufferedReader[]{};
    private static final Writer out = new BufferedWriter(new OutputStreamWriter(System.out));

    @Mock
    public BufferedReader getReader() {
        return reader;
    }

    @Mock
    public void setOutput(BufferedWriter out) {
        this.out = out;
    }

    @Test
    public void testWordWrapWithoutLineSeparator() throws Exception {
        String inputContent = fromClasspathUtf8(INPUT_FILE);
        WordWrap wordWrap = new WordWrap();
        wordWrap.wordWrap(inputContent, 20, stringWidth::new, extraWordChars, insertHyphens, breakWords);
        verify(out).write("Hello World\n");
    }

    private static String fromClasspathUtf8(String inputFilePath) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return reader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String fromFile(String inputFilePath) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String fromUtf8(InputStreamReader inputStreamReader) throws Exception {
        byte[] inputBuffer = new byte[1024];
        StringBuilder output = new StringBuilder();
        int bytesRead;
        while ((bytesRead = inputStreamReader.read(inputBuffer)) != -1) {
            output.append(new String(inputBuffer, 0, bytesRead));
        }
        return output.toString();
    }

    private static class WordWrap {
        public String wordWrap(String inputContent, int maxLength, java.util.function.IntConsumer stringWidth, Set<Character> extraWordChars, boolean insertHyphens, boolean breakWords) throws Exception {
            StringBuilder content = new StringBuilder(inputContent);
            for (char c : content.toString().toCharArray()) {
                if (c == ' ') {
                    if (!extraWordChars.isEmpty() && !breakWords) {
                        output.write(" ");
                    } else if (insertHyphens) {
                        output.write(c);
                    }
                } else {
                    if (!extraWordChars.contains(c)) {
                        output.write(c);
                    }
                    while (content.length() > maxLength && content.charAt(content.length() - 1) == ' ') {
                        output.write(" ");
                        content.deleteCharAt(content.length() - 1);
                    }
                }
            }
            return output.toString();
        }
    }

}