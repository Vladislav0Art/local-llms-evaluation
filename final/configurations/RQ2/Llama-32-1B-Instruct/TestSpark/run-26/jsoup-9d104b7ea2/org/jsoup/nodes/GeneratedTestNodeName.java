package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestNodeName {

    public static class MockAppendable implements Appendable {
        @Override
        public String append(char c) {
            return "";
        }
    }

    public static class MockDocument {
        private Document.OutputSettings out;

        public Document.OutputSettings getOutputSettings() {
            return out;
        }

        public void setOutputSettings(Document.OutputSettings outputSettings) {
            out = outputSettings;
        }

        public String toString() {
            return "";
        }
    }

    @Test
    public void testNodeName() {
        String text = "Hello World";
        Appendable app = mock(Appendable.class);
        Document document = new Document();
        document.setOutputSettings(new MockDocument());
        document.append('H');
        document.append('e');
        document.append('l');
        document.append('l');
        document.append('o');
        document.append(' ');
        document.append('W');
        document.append('o');
        document.append('r');
        document.append('l');
        document.append('d');

        assertEquals("Hello World", new StringBuilder().append(app).toString());
    }

}