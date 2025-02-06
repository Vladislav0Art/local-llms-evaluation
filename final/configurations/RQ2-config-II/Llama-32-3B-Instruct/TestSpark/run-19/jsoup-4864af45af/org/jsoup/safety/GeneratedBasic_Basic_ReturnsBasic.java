package org.jsoup.safety;

public class GeneratedBasic_Basic_ReturnsBasic {

    @Test
    public void basic_Basic_ReturnsBasic() {
        // Arrange
        Safelist basic = Safelist.basic();

        // Act
        Safelist result = new Safelist(basic);

        // Assert
        assertEquals(Safelist.basic(), result);
    }

}