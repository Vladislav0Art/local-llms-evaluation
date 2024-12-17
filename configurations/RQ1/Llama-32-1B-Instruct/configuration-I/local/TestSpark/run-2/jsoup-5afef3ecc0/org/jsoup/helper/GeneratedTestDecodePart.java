package org.jsoup.helper;

public class GeneratedTestDecodePart {

    @Test
    public void testDecodePart() {
        String inputEncoded = "path%20with%2C";
        String expectedDecoded = "path with,";

        String decodedPath = UrlBuilder.decodePart(inputEncoded);
        assert decodedPath.equals(expectedDecoded);

        String encodedString = UrlHelper.URLDecoder.encode(decodedPath, UTF_8.name());
        String expectedEncoded = "%20with%,";
        String expectedDecoded = "path%20with%,";
        assert encodedString.equals(expectedEncoded);
    }

}