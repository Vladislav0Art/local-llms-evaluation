package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_PrettyPrintSettingWorksCorrectly {

    @Test
    public void OuterHtmlHead_PrettyPrintSettingWorksCorrectly() throws IOException {
        Appendable appendable = new StringBuilder();
        Comment comment = new Comment("");
        Document.OutputSettings out = new Document.OutputSettings(true);
        comment.outerHtmlHead(appendable, 0, out);
        assertTrue(out.prettyPrint());
        assertTrue(appendable.toString().contains("<!--"));
        assertTrue(appendable.toString().endsWith("-->"));
    }

}