package org.jsoup.nodes;

public class GeneratedCreateElement_RetursElementWithGivenTagName {

    @Test
    public void createElement_RetursElementWithGivenTagName() {
        // Arrange
        String tagName = "div";
        Element expected = new Div(tagName);

        // Act
        Element actual = document.createElement(tagName);

        // Assert
        assertThat(actual, is(expected));
    }

}