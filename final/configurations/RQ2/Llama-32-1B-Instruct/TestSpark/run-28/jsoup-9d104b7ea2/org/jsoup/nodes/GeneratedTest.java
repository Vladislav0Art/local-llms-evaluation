package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testExample3() {
        String input = "Java";
        Output output = new Output();
        String expectedOutput = "<html><body>Java</body></html>";
        assertEquals(expectedOutput, output.output(input));
    }
}

class Output {
    public static String output(String input) {
        StringBuilder output = new StringBuilder("<html><body>");
        for (char c : input.toCharArray()) {
            output.append(c).append(" ");
        }
        output.append("</body></html>");
        return output.toString();
    }

    @Test
    public void testOutput() {
        String input = "Hello World";
        assertEquals("<html><body>Hello <b>World</b></body></html>", Output.output(input));
    }
}

class Output {
    public static String output(String input) {
        StringBuilder output = new StringBuilder("<html><body>");
        for (char c : input.toCharArray()) {
            if (" \n\r\t".indexOf(c) != -1) {
                output.append(" ").append(c);
            } else {
                output.append(c).append(" ");
            }
        }
        output.append("</body></html>");
        return output.toString();
    }

}