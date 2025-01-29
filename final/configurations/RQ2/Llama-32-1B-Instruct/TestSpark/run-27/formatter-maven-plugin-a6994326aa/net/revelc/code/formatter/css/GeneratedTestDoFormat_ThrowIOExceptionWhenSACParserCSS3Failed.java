package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat_ThrowIOExceptionWhenSACParserCSS3Failed {

    @Test
    public void testDoFormat_ThrowIOExceptionWhenSACParserCSS3Failed() throws IOException {
        when(sacParserCSS3.createStyleSheet()).thenThrow(new Exception());
        InputSource inputSource = new InputSource();
        inputSource.setCharacterData("/* Your CSS code here */");
        try {
            new CssFormatter().doFormat(code = inputSource.toString(), ending = LineEnding.INSERT);
        } catch (IOException e) {
            // expected
        }
    }

}