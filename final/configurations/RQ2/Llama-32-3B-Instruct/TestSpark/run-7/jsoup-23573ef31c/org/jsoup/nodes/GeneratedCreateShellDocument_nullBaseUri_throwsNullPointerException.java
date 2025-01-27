package org.jsoup.nodes;

public class GeneratedCreateShellDocument_nullBaseUri_throwsNullPointerException {

    @Test
    public void createShellDocument_nullBaseUri_throwsNullPointerException() {
        String baseUri = null;
        assertThrows(NullPointerException.class, () -> Document.createShell(baseUri));
    }

}