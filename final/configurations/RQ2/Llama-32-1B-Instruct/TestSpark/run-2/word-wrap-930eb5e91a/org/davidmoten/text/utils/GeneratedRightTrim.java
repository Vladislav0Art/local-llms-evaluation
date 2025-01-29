package org.davidmoten.text.utils;

import org.davidmoten.text.utils.Builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedRightTrim {

    @Test
    public void rightTrim() throws IOException {
        assertEquals("Hello World\n", wordWrap(new InputStreamReader(Builder.class.getResourceAsStream("test.txt")), System.out, 100,
                Function.identity(), null, false, true).getLines()[0].trim());
    }

    @VisibleForTesting
    static String wordWrap(Builder builder, StringBuilder2 out, int width, Consumer<String> lineConsumer, char[] bufferChars, boolean close, boolean noWhitespace) throws IOException {
        if (noWhitespace || !wordWrapUtil(wordWrap, lineConsumer, bufferChars, width)) {
            throw new IOException("Text does not contain any whitespace");
        }
        while (!out.isEmpty()) {
            String line = out.toString();
            if (line.length() > width) {
                wordWrapUtil(lineCutter, out, line.substring(0, width), builder);
                out.append("\n").append(lineCutter.getRemaining());
                break;
            } else if (close && !line.isEmpty() && line.charAt(line.length() - 1) == '\r') {
                close();
                throw new IOException("Line ends with a carriage return");
            }
            out.append(line);
        }
        return out.toString();
    }

    @VisibleForTesting
    static String wordWrapUtil(StringBuilder2 builder, Consumer<String> lineConsumer, String[] bufferChars, int width) throws IOException {
        while (!builder.isEmpty()) {
            if (lineConsumer.accept(builder.toString())) {
                break;
            } else if (buildNextLine(builder)) {
                continue;
            }
            return buildNextLine(builder);
        }
        throw new IOException("End of input reached");
    }

    @VisibleForTesting
    static boolean buildNextLine(StringBuilder2 builder) throws IOException {
        String line = builder.toString();
        int len = line.length();
        if (len > width) {
            // Return truncated line
            return false;
        } else if (line.charAt(len - 1) == '\r' && !line.isEmpty()) { // Check for CR+LF combinations
            lineConsumer.accept(line.substring(0, len - 1));
            builder.append("\n");
            return true;
        }
        // Return full line
        builder.setLength(len);
        return true;
    }

    @VisibleForTesting
    static String buildNextLine(StringBuilder2 builder) throws IOException {
        while (builder.length() < width && !buildNextLineHelper(builder, null)) {
            if (!lineConsumer.accept(builder.toString())) {
                throw new IOException("End of input reached");
            } else if (len > width) {
                return "\n" + buildEmptyLine(len - width);
            }
            builder.append("\n");
        }
        String[] bufferChars = new String[5];
        int len = 0;
        while (builder.length() < width && !buildNextLineHelper(builder, bufferChars)) {
            if (!lineConsumer.accept(builder.toString())) {
                throw new IOException("End of input reached");
            } else if (len > width) {
                return "\n" + buildEmptyLine(width - len);
            }
            builder.append("\n");
            len = 0;
        }
        // Return truncated line
        while (builder.length() < width && !buildNextLineHelper(builder, bufferChars)) {
            if (!lineConsumer.accept(builder.toString())) {
                throw new IOException("End of input reached");
            } else if (len > width) {
                return "\n" + buildEmptyLine(len - width);
            }
            builder.setLength(builder.length());
        }
        // Return truncated line
        String[] cut = splitStringAt(bufferChars, len);
        StringBuilder cutBuilder = new StringBuilder();
        for (int i = 0; i < cut.length; i++) {
            if (!lineConsumer.accept(cut[i])) {
                throw new IOException("End of input reached");
            }
            cutBuilder.append(cut[i]);
        }
        return String.join("", cut);
    }

    @VisibleForTesting
    static String buildEmptyLine(int len) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }

    private static boolean lineCutter(Builder builder) {
        while (builder.length() > 0 && !lineConsumer.accept(builder.toString())) {
            builder.setLength(builder.length());
        }
        return builder.length() == 0;
    }

    @VisibleForTesting
    static String[] splitStringAt(String[] array, int index) {
        StringBuilder cut = new StringBuilder();
        for (int i = 0; i < array.length - index && !lineConsumer.accept(array[i + index]); i++) {
            cut.append(array[i]).append(" ");
        }
        return cut.toString().split("\\s+");
    }

    private static String wordWrap(String text, int width) throws IOException {
        if (text.isEmpty()) {
            return "";
        } else {
            String[] words = text.split("\\s+");
            StringBuilder builder = new StringBuilder();
            for (String word : words) {
                if (!lineCutter(builder)) {
                    break;
                }
                builder.append(word).append(" ");
            }
            return builder.toString().trim() + "\n";
        }
    }

}