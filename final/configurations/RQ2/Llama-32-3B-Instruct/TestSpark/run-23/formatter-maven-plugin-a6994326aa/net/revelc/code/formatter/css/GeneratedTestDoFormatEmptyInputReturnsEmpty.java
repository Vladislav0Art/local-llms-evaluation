package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatEmptyInputReturnsEmpty {

    @Test
    public void testDoFormatEmptyInputReturnsEmpty() throws Exception {
        String input = "";
        LineEnding ending = CssFormatter.LineEnding.LF;
        CssFormatter(formatter) = new CssFormatter();
        assertEquals("", formatter.format(input, ending));
    }

}