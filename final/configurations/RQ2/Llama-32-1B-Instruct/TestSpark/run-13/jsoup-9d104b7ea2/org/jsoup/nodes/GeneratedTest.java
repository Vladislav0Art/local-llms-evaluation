package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testGenerateHtml() {
        String input = "<p>Hello World!</p>";
        System.out.println(generateHtml(input));
    }

    private String generateHtml(String input) {
        StringBuilder builder = new StringBuilder();
        if (input.contains("<!")) {
            builder.append("<head>").append("\n");
            for (int i = 1; i < input.length(); i++) {
                if (!Character.isWhitespace(input.charAt(i))) {
                    builder.append("    <").append("\n").append("      ").append(input.substring(i, i + 2)).append("</").append(">\n");
                }
            }
            builder.append("</head>");
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (!Character.isWhitespace(input.charAt(i))) {
                    builder.append("<!").append("\n").append(input.substring(i, i + 2)).append(">").append(input.substring(0, i)).append("</").append("!");
                }
            }
        }

        return builder.toString();
    }

}