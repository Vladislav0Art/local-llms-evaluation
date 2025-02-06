package org.jsoup.nodes;

public class GeneratedForms_ReturnsFormsList {

    @Test
    public void forms_ReturnsFormsList() {
        // Arrange
        List<FormElement> expected = new ArrayList<>();
        Document document = new Document(expected);

        // Act
        List<FormElement> actual = document.forms();

        // Assert
        assertThat(actual, is(expected));
    }

}