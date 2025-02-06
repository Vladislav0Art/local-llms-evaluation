package org.jsoup.nodes;

public class GeneratedExpectForm_RetursExpectedFormElement {

    @Test
    public void expectForm_RetursExpectedFormElement() {
        // Arrange
        FormElement form = new FormElement();
        Document document = new Document(form);
        String expectedCssQuery = "#my-form";
        Tag tag = new Tag("form", expectedCssQuery);

        // Act
        FormElement actual = document.expectForm(expectedCssQuery);

        // Assert
        assertThat(actual, is(form));
    }

}