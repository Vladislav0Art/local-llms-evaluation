package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat_MultipleRules {

    @Test
    public void testDoFormat_MultipleRules() throws IOException {
        String expected = "body { font-family: Arial, sans-serif; color: red; } html { background-color: #f2f2f2; }";
        CssFormatter formatter = new CssFormatter();
        String actual = formatter.doFormat("body { font-family: Arial, sans-serif; color: red; } html { background-color: #f2f2f2; }", LineEnding.LF_CRLF);
        assertEquals(expected, actual);
    }

}