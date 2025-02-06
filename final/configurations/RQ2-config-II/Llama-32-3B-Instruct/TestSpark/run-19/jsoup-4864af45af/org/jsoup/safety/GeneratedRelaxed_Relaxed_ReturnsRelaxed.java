package org.jsoup.safety;

public class GeneratedRelaxed_Relaxed_ReturnsRelaxed {

    @Test
    public void relaxed_Relaxed_ReturnsRelaxed() {
        // Arrange
        Safelist relaxed = Safelist.relaxed();

        // Act
        Safelist result = new Safelist(relaxed);

        // Assert
        assertEquals(Safelist.relaxed(), result);
    }

}