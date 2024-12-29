package com.force.i18n.grammar.impl;

public class GeneratedTest {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void constructorTests() {
        GrammaticalTermMapImpl<T> map1 = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        GrammaticalTermMapImpl<T> map2 = new GrammaticalTermMapImpl<>();

        assertEquals(ENGLISH_MAP, map1.getTerms());
        assertNull(map2.getTerms());
    }

    @Test
    public void constructorWithEmptyMapTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(EMPTY_MAP);
        assertNotNull(map.getTerms());
        assertEquals(EMPTY_MAP, map.getTerms());
    }

    @Test
    public void equalsNullTests() {
        GrammaticalTermMapImpl<T> obj1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> obj2 = null;
        assertTrue(obj1.equals(obj2));
    }

    @Test
    public void equalsSelfTests() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        assertTrue(obj.equals(obj));
    }

    @Test
    public void equalsDifferentMapsTests() {
        GrammaticalTermMapImpl<T> obj1 = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        GrammaticalTermMapImpl<T> obj2 = new GrammaticalTermMapImpl<>(ImmutableMap.of());
        assertFalse(obj1.equals(obj2));
    }

    @Test
    public void isSkinnyTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        assertTrue(map.isSkinny());
        GrammaticalTermMapImpl<T> skinnyMap = new GrammaticalTermMapImpl<>(ENGLISH_MAP, true);
        assertTrue(skinnyMap.isSkinny());
    }

    @Test
    public void makeSkinnyTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        GrammaticalTermMapImpl<T> skinnyMap = map.makeSkinny();
        assertNotNull(skinnyMap);
        assertTrue(skinnyMap.isSkinny());
    }

    @Test
    public void writeJsonTests() throws IOException {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        Appendable out = new StringBuilder();
        RenamingProvider renamingProvider = new RenamingProvider();
        LanguageDictionary dictionary = new LanguageDictionary();
        Collection<String> termsToInclude = ImmutableSet.of("term1");
        obj.writeJson(out, renamingProvider, dictionary, termsToInclude);
        assertNotNull(out.toString());
    }

    @Test
    public void keySetTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        Set<String> keys = map.keySet();
        assertEquals(1, keys.size());
        assertTrue(keys.contains("term1"));
    }

    @Test
    public void getTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        T value = map.get("term1");
        assertNotNull(value);
        assertEquals(ENGLISH_MAP.get("term1"), value);
    }

    @Test
    public void containsKeyTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        assertTrue(map.containsKey("term1"));
        assertFalse(map.containsKey("nonExistentTerm"));
    }

    @Test
    public void entrySetTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        Set<Map.Entry<String, T>> entries = map.entrySet();
        assertEquals(1, entries.size());
        assertTrue(entries.contains(Map.entry("term1", ENGLISH_MAP.get("term1"))));
    }

    @Test
    public void valuesTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        Collection<T> values = map.values();
        assertEquals(1, values.size());
        assertNotNull(values.iterator().next());
    }

    @Test
    public void putTests() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();
        obj.put("newTerm", new Noun(ENGLISH, "NewNoun"));
        assertEquals(2, obj.getTerms().size());
        assertTrue(obj.getTerms().containsValue(new Noun(ENGLISH, "NewNoun")));
    }

    @Test
    public void putAllTests() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();
        ImmutableMap<String, T> otherMap = ImmutableMap.of("term2", new Noun(ENGLISH, "OtherNoun"));
        obj.putAll(otherMap);
        assertEquals(2, obj.getTerms().size());
        assertTrue(obj.getTerms().containsValue(new Noun(ENGLISH, "NewNoun")));
    }

    @Test
    public void isEmptyTests() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();
        assertTrue(obj.isEmpty());
        GrammaticalTermMapImpl<T> nonEmptyObj = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        assertFalse(nonEmptyObj.isEmpty());
    }

}