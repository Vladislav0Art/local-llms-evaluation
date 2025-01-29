package com.adobe.epubcheck.opf;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsVideoType {

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
    public void testIsVideoType() {
        assert PublicMethods.isVideoType("video") == true;
    }

}