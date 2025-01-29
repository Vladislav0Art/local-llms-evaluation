package com.adobe.epubcheck.opf;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    public Map<String, String> getPreferredMediaType(Map<String, Object> expectedResult, String path) {
        if (path.equals("public")) {
            return new HashMap<>();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public boolean isVideoType(String type) {
        return type.toLowerCase().equals("video");
    }

    public boolean isBlessedVideoType(String type) {
        return type.toLowerCase().equals("video") || type.equalsIgnoreCase("common-video-type");
    }

    public boolean isCommonVideoType(String type) {
        return type.toLowerCase().equals("common-video-type");
    }

    public boolean isFontType(String type) {
        return type.toLowerCase().equals("font-type");
    }

    public boolean isBlessedFontType(String type) {
        return type.toLowerCase().equals("font-type") || type.equalsIgnoreCase("blessed-font-type");
    }

    public boolean isCoreMediaType(String type) {
        return type.toLowerCase().equals("core-media-type");
    }
}

public class TestPublicMethods extends PublicMethods {

    @Test
    public void testGetPreferredMediaType() {
        Map<String, Object> expectedResult = new HashMap<>();
        expectedResult.put("type", "common-video-type");
        assert getPreferredMediaType(expectedResult, "public").equals(expectedResult);
    }

    @Test
    public void testIsVideoType() {
        assert PublicMethods.isVideoType("video") == true;
    }

    @Test
    public void testIsBlessedVideoType() {
        assert PublicMethods.isBlessedVideoType("video") == true;
    }

    @Test
    public void testIsCommonVideoType() {
        assert PublicMethods.isCommonVideoType("common-video-type") == true;
    }

    @Test
    public void testIsFontType() {
        assert PublicMethods.isFontType("font-type") == true;
    }

    @Test
    public void testIsBlessedFontType() {
        assert PublicMethods.isBlessedFontType("font-type") == true;
    }

    @Test
    public void testIsCoreMediaType() {
        assert PublicMethods.isCoreMediaType("core-media-type") == true;
    }

}