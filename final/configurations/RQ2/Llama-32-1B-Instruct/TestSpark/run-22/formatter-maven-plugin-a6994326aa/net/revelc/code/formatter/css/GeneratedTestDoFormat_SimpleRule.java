package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat_SimpleRule {

    @Test
    public void testDoFormat_SimpleRule() throws IOException {
        String expected = "body { font-family: Arial, sans-serif; }";
        CssFormatter formatter = new CssFormatter();
        String actual = formatter.doFormat("body { font-family: Arial, sans-serif; }", LineEnding.LF_CRLF);
        assertEquals(expected, actual);
    }

}