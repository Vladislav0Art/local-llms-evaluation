package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_GivenTextNodeWithNoWhitespace_ReturnsEmptyString {

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
    public void outerHtmlTail_GivenTextNodeWithNoWhitespace_ReturnsEmptyString() throws IOException {
        String text = "";
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        AppendableMock.Appendable accum = mock(AppendableMock.Appendable.class);
        int depth = 0;
        textNode.outerHtmlTail(accum.writer(), depth, out);
        assertEquals("", accum.writer().toString());
    }

}