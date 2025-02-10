package org.davidmoten.text.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private LineConsumer lineConsumer;

    @Before
    public void setup() {
        this.lineConsumer = new LineConsumerImpl();
    }

    @Test
    public void testWrapWordsWithinWidth() {
        WordWrap wordWrap = new WordWrap(lineConsumer);
        String input = "This is a long string that needs to be wrapped";
        int width = 10;

        String expectedWrappedString = "This\nis a l \nong string th \nat needs to be wraped";

        String actualWrappedString = wordWrap.wordWrap(input, width);

        assertEquals(expectedWrappedString, actualWrappedString);
    }
}

class LineConsumerImpl implements LineConsumer {

    @Override
    public void accept(CharSequence input) {
        this.input = input.toString();
    }

    @Override
    public void write(Object output) {
        if (output instanceof String) {
            this.result.append((String) output).append("\n");
        }
    }

    private String result = new StringBuilder();

    public String getResult() {
        return result.toString().trim();
    }
}

class WordWrap {

    private LineConsumer lineConsumer;

    @java.lang.reflect.Constructor
    java.lang.reflect.Constructor<?> declaredConstructor0() throws java.lang.NoSuchMethodException {
        return this.getClass().getDeclaredConstructor(LineConsumer.class).newInstance(new Object[]{lineConsumer});
    }

    public String wordWrap(String input, int width) {
        StringBuilder result = new StringBuilder();

        for (String word : input.split("\\s+")) {
            if (result.length() + word.length() + 1 > width) {
                result.append("\n");
            }

            while (word.length() > width) {
                result.append(word.substring(0, width));
                result.append("\n");
                word = word.substring(width);
            }

            result.append(" ").append(word).append("\n");
        }

        return result.toString().trim();
    }
}

}