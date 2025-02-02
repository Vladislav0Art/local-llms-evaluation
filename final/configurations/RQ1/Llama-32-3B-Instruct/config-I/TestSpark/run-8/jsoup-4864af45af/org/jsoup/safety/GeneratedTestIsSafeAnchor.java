package org.jsoup.safety;

public class GeneratedTestIsSafeAnchor {

    @Test
    public void testIsSafeAnchor() {
        String validAnchor = "<a href='https://www.example.com'>Example</a>";
        System.out.println(DocumentUtils.isValidAnchor(validAnchor));

        String invalidAnchor = "<a href='invalid anchor'></a>";
        System.out.println(DocumentUtils.isValidAnchor(invalidAnchor));
    }
}

}