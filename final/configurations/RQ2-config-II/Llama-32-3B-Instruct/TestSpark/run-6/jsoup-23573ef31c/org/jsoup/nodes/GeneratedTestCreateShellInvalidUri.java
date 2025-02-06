package org.jsoup.nodes;

public class GeneratedTestCreateShellInvalidUri {

    @Test
    public void testCreateShellInvalidUri() {
        String baseUri = "";
        try {
            Document.createShell(baseUri);
            assert false;
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

}