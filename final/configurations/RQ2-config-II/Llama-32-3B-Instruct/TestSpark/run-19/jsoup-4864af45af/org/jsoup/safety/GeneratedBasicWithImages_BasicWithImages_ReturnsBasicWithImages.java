package org.jsoup.safety;

public class GeneratedBasicWithImages_BasicWithImages_ReturnsBasicWithImages {

    @Test
    public void basicWithImages_BasicWithImages_ReturnsBasicWithImages() {
        // Arrange
        Safelist basicWithImages = Safelist.basicWithImages();

        // Act
        Safelist result = new Safelist(basicWithImages);

        // Assert
        assertEquals(Safelist.basicWithImages(), result);
    }

}