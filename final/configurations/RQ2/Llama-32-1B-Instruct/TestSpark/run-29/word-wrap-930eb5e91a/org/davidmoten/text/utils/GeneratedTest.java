package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class GeneratedTest {

    private InputStream input;
    private ArrayList<String> lines;

    public static void main(String[] args) throws IOException {
        Thread thread = new Thread(new BufferedReader2());
        thread.start();
    }

    @Override
    public void run() {
        try {
            StringBuilder outputBuilder = new StringBuilder();

            while (input.ready()) {
                String line;
                if (!line.isEmpty()) {
                    lines.add(line);
                    outputBuilder.append(line).append("\n");
                } else {
                    flush(outputBuilder.toString());
                }
            }

            if (!lines.isEmpty()) {
                outputBuilder.deleteCharAt(outputBuilder.length() - 1); // remove trailing newline
            }

            String finalOutput = outputBuilder.toString();
            System.out.println(finalOutput);
        } catch (IOException e) {
            // handle exception
        }
    }

    private void flush(String output) throws IOException {
        if (!output.isEmpty()) {
            System.out.print(output);
        }
    }

}