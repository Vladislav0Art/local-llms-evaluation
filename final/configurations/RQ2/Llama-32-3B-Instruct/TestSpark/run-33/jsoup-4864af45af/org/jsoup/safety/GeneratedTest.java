package org.jsoup.safety;

public class GeneratedTest {

    private List<String> safeTags;
    private Set<String> relaxedTags;
    private Set<String> relaxedAttributes;

    public Safelist() {
        this.safeTags = new ArrayList<>();
        this.relaxedTags = new HashSet<>();
        this.relaxedAttributes = new HashSet<>();
    }

    public void addTag(String tag) {
        this.safeTags.add(tag);
    }

    public void addRelaxedTag(String tag) {
        this.relaxedTags.add(tag);
    }

    public void addAttribute(String attributeName, String attributeValue) {
        this.relaxedAttributes.add(attributeName + ":" + attributeValue);
    }

    public void removeAttribute(String attributeName, String attributeValue) {
        this.relaxedAttributes.remove(attributeName + ":" + attributeValue);
    }

    public boolean isSafeTag(String tag) {
        return this.safeTags.contains(tag);
    }

    public boolean isRelaxedTag(String tag) {
        return this.relaxedTags.contains(tag);
    }

    public boolean isSafeAttribute(String attributeName, String attributeValue) {
        return this.relaxedAttributes.contains(attributeName + ":" + attributeValue);
    }
}

public class GeneratedTest {

    @Test
    public void none_SafeList_ReturnsNone() {
        Safelist result = Safelist.none();
        assertNotNull(result);
        assertTrue(Safelist.none().isSafeTag("unknown"));
    }

    @Test
    public void simpleText_SimpleTagsReturnTrue() {
        Safelist result = Safelist.simpleText();
        assertTrue(Safelist.simpleText().isSafeTag("img"));
        assertTrue(Safelist.simpleText().isSafeTag("br"));
    }

    @Test
    public void basic_BasicTagsAndImagesReturnTrue() {
        Safelist result = Safelist.basic();
        assertTrue(Safelist.basic().isSafeTag("p"));
        assertTrue(Safelist.basic().isSafeTag("img"));
    }

    @Test
    public void addTags_AddedTagsReturnTrue() {
        Safelist result = new Safelist();
        result = result.addTags("p", "img");
        assertTrue(result.isSafeTag("p"));
        assertTrue(result.isSafeTag("img"));
    }

    @Test
    public void removeTags_RemovedTagsReturnFalse() {
        Safelist result = new Safelist();
        result = result.removeTags("p", "img");
        assertFalse(result.isSafeTag("p"));
        assertFalse(result.isSafeTag("img"));
    }

    @Test
    public void addTags_AddedTagsReturnTrue() {
        Safelist result = new Safelist();
        result = result.addTags("a");
        assertTrue(result.isSafeTag("a"));
    }

    @Test
    public void addTags_AddedTagsNotReturnTrue() {
        Safelist result = new Safelist();
        result = result.addTags("b");
        assertFalse(result.isSafeTag("b"));
    }

}