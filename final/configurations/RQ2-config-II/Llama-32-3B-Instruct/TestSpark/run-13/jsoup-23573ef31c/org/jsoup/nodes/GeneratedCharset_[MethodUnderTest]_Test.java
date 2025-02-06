package org.jsoup.nodes;

public class GeneratedCharset_[MethodUnderTest]

_Test {

    @Test
    public void charset_[ MethodUnderTest]_Test() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Document.createShell("https://www.example.com").charset(charset);
        assertEquals(charset, document.charset());
    }

}