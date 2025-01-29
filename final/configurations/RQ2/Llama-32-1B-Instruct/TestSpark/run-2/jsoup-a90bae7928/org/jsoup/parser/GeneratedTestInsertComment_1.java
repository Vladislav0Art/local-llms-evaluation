package org.jsoup.parser;

public class GeneratedTestInsertComment_1 {

    @Test
    public void testInsertComment_1() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilderImpl();
        String text = " <!-- comment --> ";
        xmlTreeBuilder.insertComment(text);
        assert !xmlTreeBuilder.result.equals(null);
    }

}