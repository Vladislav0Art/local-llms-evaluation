package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType {

    private MockEPUBCheck30 mockEPUBCheck;
    private MockHandler mockHandler;

    @Before
    public void setup() {
        mockEPUBCheck = new MockEPUBCheck30();
        mockHandler = new MockHandler(mockEPUBCheck);
    }

    @Test
    public void testGetPreferredMediaType() {
        String type = "application/x-javascript";
        String path = "";
        Object result = OPFChecker30.getPreferredMediaType(type, path);
        assertEquals("application/x-javascript", result);
    }
}

class MockEPUBCheck30 extends OPFChecker30 {
    @Override
    public boolean checkPackage() {
        return true;
    }

    @Override
    public boolean checkContent() {
        return false;
    }

    @Override
    protected void checkItem(OPFItem item, OPFHandler opfHandler) {
        if (item instanceof EPUBLocation) {
            ((EPUBLocation) item).setIsAudioType(true);
            return true; // all audio types are considered as is
        }
        return false;
    }

    @Override
    protected void checkItemAfterResourceValidation(OPFItem item) {
        OPFHandler opfHandler = new MockHandler();
        opfHandler.setCheckContent(false); // disable content checking for now
        if (item instanceof EPUBLocation && ((EPUBLocation) item).getIsAudioType()) {
            return true; // always consider audio types as is
        }
        return false;
    }

    @Override
    protected void checkSpineItem(OPFItem item, OPFHandler opfHandler) {
        if (item instanceof EPUBLocation && ((EPUBLocation) item).getIsAudioType()) {
            ((OPFHandler) opfHandler).setIsAudioType(true);
            return true; // all audio types are considered as is
        }
        return false;
    }

    @Override
    public boolean isAudioType(String type) {
        if (type.contains("audio/mpeg")) {
            return true;
        } else if (type.contains("video/mp4") || type.contains("image/png")) {
            return true;
        } else {
            return false; // by default not recognized
        }
    }

    @Override
    public boolean isBlessedAudioType(String type) {
        if (type.contains("audio/mpeg; codecs=libmp3lame")) {
            return true;
        } else if (type.contains("video/mp4; codecs=libvpx-mbg") || type.contains("image/png; codecs=libjpeg")) {
            return true;
        } else {
            return false; // by default not recognized
        }
    }

    @Override
    public boolean isVideoType(String type) {
        if (type.contains("video/mp4") || type.contains("image/png")) {
            return true;
        } else {
            return false; // by default not recognized
        }
    }

    @Override
    public boolean isBlessedVideoType(String type) {
        if (type.contains("video/mp4; codecs=libvpx-vp9") || type.contains("image/png; codecs=libjpeg")) {
            return true;
        } else {
            return false; // by default not recognized
        }
    }

    @Override
    public boolean isCommonVideoType(String type) {
        if (type.contains("video/mp4") || type.contains("image/png")) {
            return true;
        } else {
            return false; // by default not recognized
        }
    }

    @Override
    public boolean isFontType(String type) {
        if (type.contains("image/png")) {
            return true;
        } else {
            return false; // by default not recognized
        }
    }

    @Override
    public boolean isBlessedFontType(String type) {
        if (type.contains("application/x-javascript") || type.contains("image/png; codecs=libjpeg")) {
            return true;
        } else {
            return false; // by default not recognized
        }
    }

    @Override
    public boolean isBlessedScriptType(String type) {
        if (type.contains("application/x-javascript")) {
            return true;
        } else {
            return false; // by default not recognized
        }
    }

    @Override
    public String getPreferredMediaType(String type, Object path) {
        if (type.contains("image/png") || type.contains("video/mp4") || type.contains("application/x-javascript")) {
            return "image/png"; // always preferred for font types
        } else {
            return "";
        }
    }
}

class MockHandler extends OPFHandler {
    @Override
    public void setCheckContent(boolean checkContent) {
        this.checkContent = checkContent;
    }

    @Override
    public boolean isAudioType(String type) {
        // for now, always consider audio types as is
        return true;
    }

}