package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mock;

public class GeneratedTestClose {

    @Test
    public void testClose() {
        final BufferedReader reader = Mockito.mock(BufferedReader.class);
        WordWrap.from(reader, true).close(reader);
        Mockito.verify(reader).close();
    }
}

public class Builder {
    public static Writer wordWrap(Reader in, String newLine, Number maxWidth, Function<? super CharSequence, ? extends Number> stringWidth,
                                  Set<Character> extraWordChars, boolean insertHyphens, boolean breakWords) throws IOException {
        // implementation
        return writer;
    }
}

class Writer {
    private final StringBuilder buffer = new StringBuilder();
    private final BufferedReader reader;

    public Writer() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void write(String s) {
        buffer.append(s);
        try {
            reader.write(buffer.toString().getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return buffer.toString();
    }
}

public class Function<T> extends java.util.function.BinaryOperator<T> {
}

class Set<Character> {
    private final Collection<Character> values = new java.util.ArrayList<>();

    public void add(Character c) {
        values.add(c);
    }

    public int size() {
        return values.size();
    }

}