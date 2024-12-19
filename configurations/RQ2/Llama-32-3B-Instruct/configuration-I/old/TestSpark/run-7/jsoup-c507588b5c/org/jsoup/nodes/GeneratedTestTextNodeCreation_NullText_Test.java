package org.jsoup.nodes;

public class GeneratedTestTextNodeCreation_NullText_Test {

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
        public void testTextNodeCreation_NullText_Test() throws Exception {
            try {
                new TextNode();
                throw new Exception();
            } catch (Exception e) {
                // Expected
            }
        }

    }