package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclarationMatch {

    @Test
    public void testAsXmlDeclarationMatch() throws IOException {
        org.jsoup.nodes.Appendable accum = new org.jsoup.nodes.Appendable();
        Document.OutputSettings out = new Document.OutputSettings();
        Parser parser = new Parser().settings(ParseSettings.preserveCase);
        String fragment = "<!DOCTYPE html>";
        Comment comment = new Comment(fragment);
        Comment outerHtmlHeadResult = comment.outerHtmlTail(accum, 0, out);
        assertNotNull(outerHtmlHeadResult);
    }

}