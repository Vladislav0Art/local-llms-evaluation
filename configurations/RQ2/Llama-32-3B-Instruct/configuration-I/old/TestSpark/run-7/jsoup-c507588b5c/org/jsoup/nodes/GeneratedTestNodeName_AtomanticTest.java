package org.jsoup.nodes;

public class GeneratedTestNodeName_AtomanticTest {

    private String text;

    @Override
    public boolean visit(int kind, int flags) {
        return false;
    }

    @Override
    public void visit(int kind, java.lang.reflect.Method method) {
        if (kind == java.lang.reflect.Method.Kind.METHOD && method.getName().equals("setText")) {
            // Implementation for setText Method
        }
    }

    @Override
    public boolean visit(int kind, int flags) {
        return false;
    }

    @Override
    public void visit(int kind, java.lang.reflect.Field field) {
        if (kind == java.lang.reflect.Field.Kind.FIELD && field.getName().equals("text")) {
            // Implementation for text Field
        }
    }

    private String getText() {
        return text;
    }

    public static class TextNodeTest {

        @Test
        public void testNodeName_AtomanticTest() {
            String nodeName = "text";
            TextNode textNode = new TextNode();
            assertEquals(nodeName, ((TextNode) mockText()).nodeName());
        }

        private static class MockTextNode implements TextNode {

            @Override
            public boolean isBlank() {
                return false;
            }

            @Override
            public boolean isEmpty() {
                return true;
            }

            @Override
            public String text() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void setText(String value) {
                this.text = value;
            }

            @Override
            public String nodeName() {
                return "text";
            }

            @Override
            public String toString() {
                return "text";
            }
        }
    }

}