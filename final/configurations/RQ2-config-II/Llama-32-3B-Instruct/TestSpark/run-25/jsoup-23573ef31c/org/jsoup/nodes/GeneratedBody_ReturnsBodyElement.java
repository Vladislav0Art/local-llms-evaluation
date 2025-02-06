package org.jsoup.nodes;

public class GeneratedBody_ReturnsBodyElement {

    @Test
    public void body_ReturnsBodyElement() {
        // Arrange
        Tag tag = new Tag("body");
        Element expected = new Body(tag);
        Document document = new Document(expected);

        // Act
        Element actual = document.body();

        // Assert
        assertThat(actual, is(expected));
    }

}