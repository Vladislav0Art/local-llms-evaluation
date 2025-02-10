package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        // Given
        String text = "Hello World!";
        Document document = new Document();
        Appendable appendable = new StringBuilder();

        // When
        TextNode clone = document.getTextNode().clone();

        // Then
        Assert.assertNotNull(clone);
        Assert.assertEquals(text, clone.getWholeText());
    }

}