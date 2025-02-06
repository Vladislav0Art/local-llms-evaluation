package org.jsoup.safety;

public class GeneratedNone_SafeList_ReturnsNone {

    @Test
    public void none_SafeList_ReturnsNone() {
        // Arrange
        Safelist none = Safelist.none();

        // Act
        Safelist result = new Safelist(none);

        // Assert
        assertEquals(Safelist.none(), result);
    }

}