package org.jsoup.nodes;

public class GeneratedCharset_ReturnsCharsetObject {

    @Test
    public void charset_ReturnsCharsetObject() {
        // Arrange
        Charset charset = DataUtil.UTF_8;
        Document document = new Document(charset);

        // Act
        Charset actual = document.charset();

        // Assert
        assertThat(actual, is(charset));
    }

}