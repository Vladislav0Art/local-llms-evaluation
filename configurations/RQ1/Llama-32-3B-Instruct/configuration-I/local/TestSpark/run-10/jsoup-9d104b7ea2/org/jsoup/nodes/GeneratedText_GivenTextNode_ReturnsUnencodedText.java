package org.jsoup.nodes;

public class GeneratedText_GivenTextNode_ReturnsUnencodedText {

    public static class Appendable implements java.io.Appendable {
        private StringBuilder sb = new StringBuilder();

        @Override
        public void append(CharSequence csq) {
            sb.append(csq);
        }

        @Override
        public void append(CharSequence csq, int start, int end) {
            sb.append(csq, start, end);
        }

        @Override
        public java.io.Writer writer() {
            return new java.io.StringWriter(sb.toString());
        }
    }

    public static Appendable mock(Class<? extends Appendable> clazz) {
        if (clazz.equals(Appendable.class)) {
            return new AppendableMock.Appendable();
        } else {
            throw new UnsupportedOperationException("Mocking class " + clazz.getName() + " is not supported");
        }
    }
}

public class TextNodeTest {

    @Test
    public void text_GivenTextNode_ReturnsUnencodedText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}