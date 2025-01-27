package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatNoInput {

    @Test
    public void testDoFormatNoInput() throws IOException {
        InputSource input = new InputSource(new ByteArrayInputStream(""));
        CssFormatter formatter = new CssFormatter();
        assertEquals("", formatter.doFormat(input));
    }

}