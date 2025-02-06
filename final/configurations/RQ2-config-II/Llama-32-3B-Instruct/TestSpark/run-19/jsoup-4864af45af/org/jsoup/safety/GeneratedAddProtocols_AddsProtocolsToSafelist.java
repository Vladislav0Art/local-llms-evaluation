package org.jsoup.safety;

public class GeneratedAddProtocols_AddsProtocolsToSafelist {

    @Test
    public void addProtocols_AddsProtocolsToSafelist() {
        // Arrange
        String tag = "img";
        String attribute = "src";
        String[] protocols = {"http", "https"};
        Safelist safelist = Safelist.addProtocols(tag, attribute, protocols);
        Safelist result = new Safelist(safelist);

        // Act

        // Assert
        assertEquals(protocols[0], result.getEnforcedAttributes(tag).getAttribute(attribute));
    }

}