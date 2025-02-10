package org.davidmoten.text.utils;

import org.davidmoten.text.utils.File;
import org.davidmoten.text.utils.InputStream;
import org.davidmoten.text.utils.OutputStream;
import org.junit.jupiter.api.Test;

public class GeneratedTestWordWrap {

    @Test
    public void testWordWrap() {
        String text = "This is a sample text that needs to be wrapped.";
        int lineLength = 10;
        long wrapAt = 5L;

        InputStream in = new InputStream(new File("test.txt"));
        OutputStream out = new OutputStream();

        WordWrap.wordWrap(in, out, lineLength, wrapAt, c -> wrapAt, new HashSet<>(), false, true);

        out.flush();
    }
}

public class WordWrap {
    public static void wordWrap(Reader in, Writer out, int lineLength, long wrapAt, Consumer<String> callback, Collection<String> lines, boolean newlineAfterEol, boolean breakLongWords) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        boolean lastLine = false;

        while (true) {
            char ch = in.read();
            if (ch == -1) {
                break;
            }

            sb.append(ch);

            if (c >= lineLength || (breakLongWords && sb.length() * 8 > wrapAt)) {
                callback.accept(sb.toString());
                sb.setLength(0);
                c = 0;
                lastLine = true;

                while (in.ready()) {
                    ch = in.read();
                    if (ch == -1) {
                        break;
                    }
                    sb.append(ch);
                }

            } else if (newlineAfterEol && ch == '\n') {
                callback.accept(sb.toString());
                sb.setLength(0);
                c = 0;
                lastLine = false;

            } else {
                c++;
            }
        }

        if (!lastLine) {
            callback.accept(sb.toString());
        }
    }
}

public class Reader implements AutoCloseable {
    public String read() throws Exception {
        return "Sample text";
    }

    @Override
    public void close() throws Exception {

    }
}

public class Writer implements AutoCloseable {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void write(int c) throws IOException {
        sb.append((char) c);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    @Override
    public void close() throws IOException {

    }
}

public class OutputStream implements AutoCloseable {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void write(int c) throws IOException {
        sb.append((char) c);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    @Override
    public void close() throws IOException {

    }
}

public class Consumer<T> {
    public void accept(T t) {
    }

}