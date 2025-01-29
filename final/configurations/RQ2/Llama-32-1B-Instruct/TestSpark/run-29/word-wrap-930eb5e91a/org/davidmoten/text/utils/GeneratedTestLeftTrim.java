package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GeneratedTestLeftTrim {

    private InputStream input;
    private BufferedWriter output;

    public static void main(String[] args) throws IOException {
        Thread thread = new Thread(new BufferedReader2());
        thread.start();
    }

    @Override
    public void run() {
        try {
            String line;
            while ((line = input.readLine()) != null) {
                if (isLineLength(line)) {
                    output.write(line);
                    output.newLine();
                }
            }
            flush(output);
        } catch (IOException e) {
            // handle exception
        }
    }

    private boolean isLineLength(String str) {
        return str.length() <= 4096;
    }

    public void flush(BufferedWriter out) throws IOException {
        if (!out.isEmpty()) {
            output.write(out.toString());
            out.close();
        }
    }

    @Test
    public void testLeftTrim() {
        while (input.ready()) {
            input.readLine();
        }
        assertEquals(0, out.length());
    }

}