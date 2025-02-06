package org.jsoup.safety;

public class GeneratedRemoveProtocols_RemovesProtocolsFromSafelist {

    @Test
    public void removeProtocols_RemovesProtocolsFromSafelist() {
        // Arrange
        String tag = "img";
        Safelist safelist = Safelist.addProtocols(tag, "src", new String[]{"http"});
        Safelist result = Safelist.removeProtocols(tag, "src", new String[]{"https"});

        // Act

        // Assert
        assertTrue(result.isSafeAttribute("img", null, null));
    }

}