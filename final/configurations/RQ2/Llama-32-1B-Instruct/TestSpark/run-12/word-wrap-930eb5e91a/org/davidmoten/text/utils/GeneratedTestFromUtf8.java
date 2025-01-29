package org.davidmoten.text.utils;

public class GeneratedTestFromUtf8 {

    @Test
    public void testFromUtf8() throws IOException {
        System.out.println("Hello\nWorld");
    }
}

public class Utils {
    public static void testFromReader(Reader in, Writer out, String newLine, Number maxWidth, Function<? super CharSequence, ? extends Number> stringWidth, Set<Character> extraWordChars) throws IOException {
        try (BufferedReader reader = new BufferedReader(in)) {
            StringBuilder currentLine = new StringBuilder();
            int wordLength = 0;
            while (true) {
                char c = reader.read();
                if (!c || c == '\n') {
                    String line = insertHyphens ? breakWords : currentLine.toString().toLowerCase();
                    out.write(line.equals(currentLine.toString()) ? "" : "\n");
                    try (InputStream in2 = new FileInputStream("word_list.txt")) {
                        BufferedReader reader2 = new BufferedReader(new InputStreamReader(in2));
                        while (reader2.ready()) {
                            String word = reader2.readLine();
                            if (!extraWordChars.contains(word.charAt(0))) {
                                currentLine.append(word).append(' ');
                                wordLength++;
                            } else if (wordLength > maxWidth) {
                                break;
                            }
                        }
                    }
                } else {
                    currentLine.append(c);
                    wordLength += 1;
                    String line = insertHyphens ? breakWords : currentLine.toString().toLowerCase();
                    out.write(line.equals(currentLine.toString()) ? "" : "\n");
                    try (InputStream in2 = new FileInputStream("word_list.txt")) {
                        BufferedReader reader2 = new BufferedReader(new InputStreamReader(in2));
                        while (reader2.ready()) {
                            String word = reader2.readLine();
                            if (!extraWordChars.contains(word.charAt(0))) {
                                currentLine.append(word).append(' ');
                                wordLength++;
                            } else if (wordLength > maxWidth) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        try (InputStream in2 = new FileInputStream("word_list.txt")) {
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(in2));
            while (reader2.ready()) {
                String word = reader2.readLine();
                if (!extraWordChars.contains(word.charAt(0))) {
                    currentLine.append(word).append(' ');
                    wordLength += 1;
                } else if (wordLength > maxWidth) {
                    break;
                }
            }
        }

    }

    public static void testFromClasspath() throws IOException {
        System.out.println("This is a classpath test");
    }

    public static void testFromClasspath2() throws IOException {
        System.out.println("This is another classpath test");
    }

    public static void testFromUtf8() throws IOException {
        System.out.println("Hello\nWorld");
    }
}

public class Utils2 {
    public static void wordWrap(Reader in, Writer out, String newLine, Number maxWidth, Function<? super CharSequence, ? extends Number> stringWidth, Set<Character> extraWordChars) throws IOException {
        WordWrap.wordWrap(in, out, newLine, maxWidth, stringWidth, extraWordChars);
    }

    public static void testFromUtf8() throws IOException {
        System.out.println("Hello\nWorld");
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Utils.testFromReader(System.in, System.out, "\n", 10L, null, HashSet < > (), false);
        Utils.testFromUtf8();
        WordWrap.wordWrap(System.in, System.out, "Hello\nWorld", 100L, null, HashSet < > (), false, true);
    }

}