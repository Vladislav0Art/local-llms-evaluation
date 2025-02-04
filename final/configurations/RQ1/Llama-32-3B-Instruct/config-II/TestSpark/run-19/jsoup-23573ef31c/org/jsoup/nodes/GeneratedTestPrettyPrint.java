package org.jsoup.nodes;

public class GeneratedTestPrettyPrint {

    @Test
    public void testPrettyPrint() {
        Document document = new Document();
        Assert.assertFalse(document.outputSettings().prettyPrint());
        document.outputSettings().prettyPrint(true);
        Assert.assertTrue(document.outputSettings().prettyPrint());
    }

}