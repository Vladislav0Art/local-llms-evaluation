package org.jsoup.nodes;

public class GeneratedTestNotNull {

    private static class TestSpark {
        public void run() {
        }
    }

    public static class ParseSettings {
        public boolean isTrue(boolean b) {
            return b;
        }
    }

    public static class Parser {
        public ParseSettings settings;

        public Parser(ParseSettings settings) {
            this.settings = settings;
        }

        public Object parse(String input) throws Exception {
            if (settings.isTrue(input.equals("<comment>This is a test</comment>"))) {
                return "<comment>This is a test</comment>";
            } else if (input.equals("<comment>This is not a comment</comment>")) {
                return null;
            }
            return input;
        }

        public ParseSettings asXmlDeclaration() throws Exception {
            return new ParseSettings(true);
        }
    }

    @Test
    public void testNotNull() throws Exception {
        TestSpark spark = new TestSpark();
        ParseSettings settings = parseSettings();
        Parser parser = parse(settings);
        Object object = parser.parse("<comment>This is not a test</comment>");
        assertNotNull(object);
    }

    private static ParseSettings parseSettings() {
        return new ParseSettings(true, true);
    }

}