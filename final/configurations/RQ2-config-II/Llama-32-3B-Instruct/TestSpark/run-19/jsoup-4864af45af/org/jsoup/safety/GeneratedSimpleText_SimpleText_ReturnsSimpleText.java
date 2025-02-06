package org.jsoup.safety;

public class GeneratedSimpleText_SimpleText_ReturnsSimpleText {

    @Test
    public void simpleText_SimpleText_ReturnsSimpleText() {
        // Arrange
        Safelist simpleText = Safelist.simpleText();

        // Act
        Safelist result = new Safelist(simpleText);

        // Assert
        assertEquals(Safelist.simpleText(), result);
    }

}