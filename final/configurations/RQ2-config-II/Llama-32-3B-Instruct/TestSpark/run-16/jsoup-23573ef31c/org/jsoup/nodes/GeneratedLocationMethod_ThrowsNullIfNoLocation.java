package org.jsoup.nodes;

public class GeneratedLocationMethod_ThrowsNullIfNoLocation {

    @Test
    public void locationMethod_ThrowsNullIfNoLocation() {
        assertThrows(NullPointerException.class, () -> Document.createShell("").location());
    }

}