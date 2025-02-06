package org.jsoup.safety;

public class GeneratedPreserveRelativeLinks_PreserveLinks {

    @Test
    public void preserveRelativeLinks_PreserveLinks() {
        // Arrange
        boolean preserve = true;
        Safelist safelist = Safelist.preserveRelativeLinks(preserve);
        Safelist result = new Safelist(safelist);

        // Act

        // Assert
        assertTrue(result.preserveRelativeLinks(preserve));
    }

}