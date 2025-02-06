package org.jsoup.nodes;

public class GeneratedHead_ReturnsHeadElement {

    @Test
    public void head_ReturnsHeadElement() {
        // Arrange
        Tag tag = new Tag("head");
        Element expected = new Head(tag);
        Document document = new Document(expected);

        // Act
        Element actual = document.head();

        // Assert
        assertThat(actual, is(expected));
    }

}