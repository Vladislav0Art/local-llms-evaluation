package org.jsoup.nodes;

public class GeneratedTextNodeGetWholeTextTestsReturnsCorrectContent {

    public static class Document {
        public static interface OutputSettings {
            void outerHtmlHead(Appendable accum, int depth, OutputSettings out) throws IOException {
            }

            ;

            void outerHtmlTail(Appendable accum, int depth, OutputSettings out) throws IOException {
            }

            ;
        }

        public static class Appendable implements java.io.Serializable {
            @Override
            public String toString();
        }
    }

    public class TextNode {
        private String text;

        public TextNode(String text) {
            this.text = text;
        }

        public String text() {
            return text;
        }

        public void text(String text) {
            this.text = text;
        }

        public String getWholeText() {
            return text;
        }

        public boolean isBlank() {
            return text.isEmpty();
        }

        public TextNode splitText(int offset) {
            // implement logic here
            return this;
        }

        @Override
        public String toString() {
            return "<p>" + text + "</p>";
        }

        public interface OutputSettings {
            void outerHtmlHead(Appendable accum, int depth, OutputSettings out) throws IOException {
            }

            ;

            void outerHtmlTail(Appendable accum, int depth, OutputSettings out) throws IOException {
            }

            ;
        }
    }

    @Test
    public void textNodeGetWholeTextTestsReturnsCorrectContent() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}