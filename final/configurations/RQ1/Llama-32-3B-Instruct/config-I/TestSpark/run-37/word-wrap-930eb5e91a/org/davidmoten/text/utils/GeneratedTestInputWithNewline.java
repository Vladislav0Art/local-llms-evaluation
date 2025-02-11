package org.davidmoten.text.utils;

public class GeneratedTestInputWithNewline {

    private final String input;

    public LineWrapper(String input) {
        this.input = input;
    }

    public static void main(String[] args) throws Exception {
        LineWrapper lineWrapper = new LineWrapper("Hello World");
        System.out.println(lineWrapper.toString());

        LineWrapper lineWrapper2 = new LineWrapper("\t   Hello World\t  ");
        System.out.println(lineWrapper2.toString());

        LineWrapper lineWrapper3 = new LineWrapper("Hello\nWorld");
        System.out.println(lineWrapper3.toString());
    }

    @Override
    public String toString() {
        return LineWrapper.lineToString(input);
    }
}

public class TestLineWrapper {

    @Test
    public void testInputWithNewline() throws Exception {
        String input = "Hello\nWorld";
        LineWrapper lineWrapper = new LineWrapper(input);
        assertEquals("Hello\nWorld", lineWrapper.toString());
    }

}