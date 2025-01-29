package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

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
    public void testIsXmlDeclaration() throws Exception {
        TestSpark spark = new TestSpark();
        ParseSettings settings = parseSettings();
        Parser parser = parse(settings);
        Document document = parser.parse("<comment>This is a test</comment>");
        Document comment = (Document) document;
        assertTrue(comment.isXmlDeclaration());
    }

}