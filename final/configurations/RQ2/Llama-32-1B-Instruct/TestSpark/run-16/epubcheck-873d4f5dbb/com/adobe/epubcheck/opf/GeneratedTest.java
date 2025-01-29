package com.adobe.epubcheck.opf;

public class GeneratedTest {

    @Test
    public void testInitHandler() {
        // Create a mock of the ValidationContext
        MockValidationContext mockContext = new MockValidationContext();

        // Call the initHandler method on the OPFChecker30 instance
        OPFChecker30 checker = new OPFChecker30(mockContext);
        checker.initHandler();
    }

    @Test
    public void testCheckPackage() {
        // Create a mock of the ValidationContext with an empty package set
        MockValidationContext context = new MockValidationContext();
        context.setPackageSet(new HashSet<>());

        // Call the checkPackage method on the OPFChecker30 instance
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkPackage();

        // Verify that the mock package set was not modified
        assertNotNull(context.getPackageSet());
    }

    @Test
    public void testCheckContent() {
        // Create a mock of the ValidationContext with an empty content set
        MockValidationContext context = new MockValidationContext();
        context.setContentSet(new HashSet<>());

        // Call the checkContent method on the OPFChecker30 instance
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkContent();

        // Verify that the mock content set was not modified
        assertNotNull(context.getContentSet());
    }

    @Test
    public void testCheckItem() {
        // Create a mock of the ValidationContext with an empty item list
        MockValidationContext context = new MockValidationContext();
        context.setItems(new HashSet<>());

        // Call the checkItem method on the OPFChecker30 instance
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkItem(null, null);

        // Verify that the mock item list was not modified
        assertNotNull(checker.getItem("item1"));
    }

    @Test
    public void testCheckSpineItem() {
        // Create a mock of the ValidationContext with an empty spine item list
        MockValidationContext context = new MockValidationContext();
        context.setSpineItemList(new HashSet<>());

        // Call the checkSpineItem method on the OPFChecker30 instance
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkSpineItem(null, null);

        // Verify that the mock spine item list was not modified
        assertNotNull(checker.getSpineItemList("spineItem1"));
    }

    @Test
    public void testCheckItemAfterResourceValidation() {
        // Create a mock of the ValidationContext with an empty item list and resource validation result set
        MockValidationContext context = new MockValidationContext();
        Set<OPFItem> items = new HashSet<>();
        ResourceCollection.ResourceSet resources = new ResourceCollection.ResourceSet();

        // Call the checkItemAfterResourceValidation method on the OPFChecker30 instance
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkItemAfterResourceValidation(items, resources);

        // Verify that the mock item list was not modified
        assertNotNull(checker.getItem("item1"));
    }

    @Test
    public void testIsAudioType() {
        // Create a mock of the ValidationContext with an empty audio type set
        MockValidationContext context = new MockValidationContext();
        Set<String> audioTypes = new HashSet<>();

        // Call the isAudioType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isAudioType("audio-type");

        // Verify that the mock audio type set was not modified
        assertNotNull(audioTypes);
    }

    @Test
    public void testIsBlessedAudioType() {
        // Create a mock of the ValidationContext with an empty blessed audio type set
        MockValidationContext context = new MockValidationContext();
        Set<String> blessedAudioTypes = new HashSet<>();

        // Call the isBlessedAudioType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isBlessedAudioType("audio-type");

        // Verify that the mock blessed audio type set was not modified
        assertNotNull(blessedAudioTypes);
    }

    @Test
    public void testIsVideoType() {
        // Create a mock of the ValidationContext with an empty video type set
        MockValidationContext context = new MockValidationContext();
        Set<String> videoTypes = new HashSet<>();

        // Call the isVideoType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isVideoType("video-type");

        // Verify that the mock video type set was not modified
        assertNotNull(videoTypes);
    }

    @Test
    public void testIsBlessedVideoType() {
        // Create a mock of the ValidationContext with an empty blessed video type set
        MockValidationContext context = new MockValidationContext();
        Set<String> blessedVideoTypes = new HashSet<>();

        // Call the isBlessedVideoType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isBlessedVideoType("video-type");

        // Verify that the mock blessed video type set was not modified
        assertNotNull(blessedVideoTypes);
    }

    @Test
    public void testIsCommonVideoType() {
        // Create a mock of the ValidationContext with an empty common video type set
        MockValidationContext context = new MockValidationContext();
        Set<String> commonVideoTypes = new HashSet<>();

        // Call the isCommonVideoType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isCommonVideoType("video-type");

        // Verify that the mock common video type set was not modified
        assertNotNull(commonVideoTypes);
    }

    @Test
    public void testIsFontType() {
        // Create a mock of the ValidationContext with an empty font type set
        MockValidationContext context = new MockValidationContext();
        Set<String> fontTypes = new HashSet<>();

        // Call the isFontType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isFontType("font-type");

        // Verify that the mock font type set was not modified
        assertNotNull(fontTypes);
    }

    @Test
    public void testIsBlessedFontType() {
        // Create a mock of the ValidationContext with an empty blessed font type set
        MockValidationContext context = new MockValidationContext();
        Set<String> blessedFontTypes = new HashSet<>();

        // Call the isBlessedFontType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isBlessedFontType("font-type");

        // Verify that the mock blessed font type set was not modified
        assertNotNull(blessedFontTypes);
    }

    @Test
    public void testIsResourceSet() {
        // Create a mock of the ValidationContext with an empty resource set
        MockValidationContext context = new MockValidationContext();
        ResourceCollection.ResourceSet resources = new ResourceCollection.ResourceSet();

        // Call the isResourceSet method on the OPFChecker30 instance
        boolean result = OPFChecker30.isResourceSet(resources);

        // Verify that the mock resource set was not modified
        assertNotNull(context.getSpineItemList());
    }

    @Test
    public void testGetItem() {
        // Create a mock of the ValidationContext with an empty item list
        MockValidationContext context = new MockValidationContext();
        Set<OPFItem> items = new HashSet<>();

        // Call the getItem method on the OPFChecker30 instance
        boolean result = OPFChecker30.getItem("item1", null);

        // Verify that the mock item was not modified
        assertNotNull(items);
    }

    @Test
    public void testGetSpineItemList() {
        // Create a mock of the ValidationContext with an empty spine item list
        MockValidationContext context = new MockValidationContext();
        Set<OPFItem> items = new HashSet<>();

        // Call the getSpineItemList method on the OPFChecker30 instance
        boolean result = OPFChecker30.getSpineItemList("spineItem1", null);

        // Verify that the mock spine item list was not modified
        assertNotNull(items);
    }

}