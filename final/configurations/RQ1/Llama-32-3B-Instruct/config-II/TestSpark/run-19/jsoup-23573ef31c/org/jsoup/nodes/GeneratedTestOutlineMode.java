package org.jsoup.nodes;

public class GeneratedTestOutlineMode {

    @Test
    public void testOutlineMode() {
        Document document = new Document();
        Assert.assertFalse(document.outputSettings().outline());
        document.outputSettings().outline(true);
        Assert.assertTrue(document.outputSettings().outline());
    }
}

}