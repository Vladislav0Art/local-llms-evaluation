package org.jsoup.nodes;

public class GeneratedTestCharset {

    @Test
    public void testCharset() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        Charset charset = form.charset();
        // Since the charset method is not available in the provided classes,
        // this test will fail.
        assertNotNull(charset);
    }

}