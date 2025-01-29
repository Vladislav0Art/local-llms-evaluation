package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class GeneratedWordWrap {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    @Mock
    public static String setOutput(BufferedWriter out) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Test
    public void wordWrap() throws Exception {
        String inputContent = "This is a test string";
        int maxLength = 20;
        ArrayList<java.util.function.IntConsumer> stringWidths = new ArrayList<>();
        stringWidths.add(s -> System.out.println(s));
        setOutput(out);
        out.write(wordWrap(inputContent, maxLength, stringWidths.get(0)));
    }

}