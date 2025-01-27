package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testForms() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        assertNotNull(form);
    }

    @Test
    public void testTitle() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        String title = form.title();
        assertNotNull(title);
    }

    @Test
    public void testText() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        Element element = form.element();
        String text = document.text(element);
        assertNotNull(text);
    }

    @Test
    public void testName() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        String name = form.name();
        assertFalse(name.isEmpty());
    }

    @Test
    public void testCharset() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        Charset charset = form.charset();
        // Since the charset method is not available in the provided classes,
        // this test will fail.
        assertNotNull(charset);
    }

    @Test
    public void testEmptyForm() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        assertFalse(form.isEmpty());
    }

}