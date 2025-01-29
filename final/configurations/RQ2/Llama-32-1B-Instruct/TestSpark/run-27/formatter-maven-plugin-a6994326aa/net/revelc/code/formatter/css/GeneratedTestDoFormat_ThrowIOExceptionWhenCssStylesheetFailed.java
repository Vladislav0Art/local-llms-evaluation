package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat_ThrowIOExceptionWhenCssStylesheetFailed {

    @Test
    public void testDoFormat_ThrowIOExceptionWhenCssStylesheetFailed() throws IOException {
        when(cssFormat.createCssStylesheet()).thenThrow(new Exception());
        InputSource inputSource = new InputSource();
        inputSource.setCharacterData("/* Your CSS code here */");
        try {
            new CssFormatter().doFormat(code = inputSource.toString(), ending = LineEnding.INSERT);
        } catch (IOException e) {
            // expected
        }
    }

}