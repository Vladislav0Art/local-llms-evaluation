package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestParseFragment {

    public static String testParseFragment() {
        Document doc = Jsoup.parse("<html><body></body></html>");
        return doc.body().text();
    }

    public static void main(String[] args) {
        System.out.println(testParseFragment());
    }
}

import org.junit.Test;

public class MainTest {

    @Test
    public void testParseFragment() {
        String inputFragment = "<p>Test Paragraph</p>";
        String expectedOutput = "<p></p>";
        JsoupParser.main(inputFragment, null, null);
        assert MainTest.testParseFragment().equals(expectedOutput);

        // Test case 2: Non-empty input fragment with simple tag
        inputFragment = "<p>Test Paragraph</p>";
        expectedOutput = "<p></p>";
        MainParser.main(inputFragment, null, null);
        assert MainTest.testParseFragment().equals(expectedOutput);

        // Test case 3: Non-empty input fragment with multiple tags
        inputFragment = "<body><div>Test Div</div><p>Test Paragraph</p></body>";
        expectedOutput = "<body><div>This is the second div.</div><p>This is the third paragraph.</p></body>";
        MainParser.main(inputFragment, null, null);
        assert MainTest.testParseFragment().equals(expectedOutput);

        // Test case 4: Non-empty input fragment with multiple tags and elements
        inputFragment = "<body><div>Test Div</div><p>Test Paragraph</p></body>";
        expectedOutput = "<body><div>This is the second div.</div><p>This is the third paragraph.</p></body>";
        MainParser.main(inputFragment, null, null);
        assert MainTest.testParseFragment().equals(expectedOutput);

        // Test case 5: Empty body
        inputFragment = "<html><head>Test Head</head><body></body></html>";
        expectedOutput = "";
        MainParser.main(inputFragment, null, null);
        assert MainTest.testParseFragment().equals(expectedOutput);
    }

    public static class JsoupParser {
        public static void main(String[] args) {
            testParseFragment();
        }
    }

    public static class MainParser {
        public static void main(String[] args) {
            System.out.println(testParseFragment());
        }
    }

}