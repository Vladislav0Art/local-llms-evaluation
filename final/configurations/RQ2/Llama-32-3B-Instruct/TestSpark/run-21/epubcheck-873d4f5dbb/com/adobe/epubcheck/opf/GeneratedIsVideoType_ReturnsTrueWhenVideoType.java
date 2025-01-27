package com.adobe.epubcheck.opf;

public class GeneratedIsVideoType_ReturnsTrueWhenVideoType {

    private boolean isValidated;

    public void setValidated(boolean validated) {
        this.isValidated = validated;
    }

    public boolean getIsValidated() {
        return isValidated;
    }
}

public enum EPUBVersion {
    V20,
    V30
}

public class Metadata {
    // metadata properties
}

public class OPFItem {
    private List<String> roles;

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<String> getRoles() {
        return roles;
    }
}

public class OPFChecker30 {

    private ValidationContext context;

    public OPFChecker30(ValidationContext context) {
        this.context = context;
    }

    public void initHandler() {
        context.setIsValidated(true);
    }

    public boolean checkPackage() {
        // implementation
        return true;
    }

    public void checkContent(Metadata metadata) {
        // implementation
    }

    public void checkItem(OPFItem item, OPFHandler handler) {
        // implementation
    }

    public void checkSpineItem(OPFItem item, OPFHandler handler) {
        // implementation
    }

    public boolean isAudioType(String type) {
        // implementation
        return true;
    }

    public boolean isBlessedAudioType(String type) {
        // implementation
        return false;
    }

    public boolean isVideoType(String type) {
        // implementation
        return true;
    }

    public boolean isBlessedVideoType(String type) {
        // implementation
        return false;
    }

    public boolean isCommonVideoType(String type) {
        // implementation
        return false;
    }

    public boolean isFontType(String type) {
        // implementation
        return false;
    }

    public boolean isBlessedFontType(String type) {
        // implementation
        return false;
    }

    public boolean isBlessedScriptType(String type) {
        // implementation
        return false;
    }

    public String getPreferredMediaType(String type, String path) {
        // implementation
        return "type";
    }
}

public class OPFHandler {
}

public class GeneratedTest {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        opfChecker30.initHandler();
    }

    @Test
    public void isVideoType_ReturnsTrueWhenVideoType() {
        String type = "video";
        assertTrue(opfChecker30.isVideoType(type));
    }

}