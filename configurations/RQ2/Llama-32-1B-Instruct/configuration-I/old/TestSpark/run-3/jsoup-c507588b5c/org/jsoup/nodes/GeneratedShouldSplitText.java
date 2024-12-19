package org.jsoup.nodes;

public class GeneratedShouldSplitText {

    @Test
    public void shouldSplitText() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        String result1 = textNode.splitText(0).getText();
        String result2 = textNode.splitText(7).getText();
        assertEquals("World", result1);
        assertEquals("Hello World", result2);
    }

    public class AppendableMock implements Appendable {
        @Override
        public void append(CharSequence csq) throws IOException {
            // return a string buffer with the given character sequence
        }

        @Override
        public void append(char c) throws IOException {
            // do nothing, just allow this method to be called
        }
    }

    public class DocumentOutputSettingsMock implements Document.OutputSettings {
        @Override
        public OutputSettings outputSettings() {
            return null;
        }
    }

}