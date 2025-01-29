package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat_EmptyCode {

    @Test
    public void testDoFormat_EmptyCode() throws IOException {
        String expected = "";
        CssFormatter formatter = new CssFormatter();
        String actual = formatter.doFormat("", LineEnding.LF_CRLF);
        assertEquals(expected, actual);
    }

}