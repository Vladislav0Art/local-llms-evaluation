package org.jsoup.safety;

public class GeneratedCopy_CopyReturnsCopy {

    @Test
    public void copy_CopyReturnsCopy() {
        // Arrange
        Safelist original = Safelist.basic();
        Safelist copy = Safelist.copy(original);

        // Act
        Safelist result = new Safelist(copy);

        // Assert
        assertEquals(Safelist.copy(original), result);
    }

}