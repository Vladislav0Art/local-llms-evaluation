package org.jsoup.nodes;

public class GeneratedTestShallowClone {

    @Test
    public void testShallowClone() {
        // Arrange
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document();

        // Act
        Document shallowClone = document.shallowClone(outputSettings);

        // Assert
        assertNotNull(shallowClone);
    }

}