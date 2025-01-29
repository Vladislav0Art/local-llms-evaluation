package com.force.i18n.grammar.impl;

public class GeneratedTest {


    private static final Map<String, String> map = ImmutableMap.of("term1", "value1");
    private static final Set<String> keySet = new HashSet<>(Collections.singletonList("key"));
    private static final Collection<T> values = new ArrayList<>();
    private static final Set<Map.Entry<String, T>> entrySet = new HashSet<>();
    private static final Map<String, String> mapSerializer = new MapSerializer();
    private static final RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
    private static final LanguageDictionary languageDictionary = Mockito.mock(LanguageDictionary.class);

    @Test
    public void testGet() {
        verify(languageDictionary).get("key");
        assert values.size() == 1;
    }

    @Test
    public void testIsSkinny() {
        assertTrue(GrammaticalTermMapImplImplImpl.this.isSkinny());
    }

    @Test
    public void testMakeSkinny() {
        String newKey = mapSerializer.serialize("newKey");
        GrammaticalTermMapImpl<T> skinnyMap = (GrammaticalTermMap<T>) this.makeSkinny();
        assertEquals(newKey, skinnyMap.keySet().iterator().next());
    }

    @Test
    public void testEquals() {
        String term1 = "term1";
        String term2 = "term1";
        GrammaticalTermMapImpl<T> map1 = (GrammaticalTermMap<T>) this;
        GrammaticalTermMapImpl<T> map2 = new GrammaticalTermMapImpl<>(map, true);
        assert (!map1.equals(map2));
    }

    @Test
    public void testContainsKey() {
        assertTrue(GrammaticalTermMapImplImplImpl.this.containsKey("term"));
    }

    @Test
    public void testKeySet() {
        verify(keySet);
        map.forEach((k, v) -> entrySet.add(new AbstractMap.SimpleEntry<>(k, v)));
        assert !entrySet.isEmpty();
    }

    @Test
    public void testGetByName() throws IOException {
        T term = (T) this.get("term");
        assertEquals(term, new GrammaticalTermImpl(term).newGrammaticalTerm());
    }

    @Test
    public void testGetAllKeys() {
        verify(entrySet);
        map.forEach((k, v) -> entrySet.add(new AbstractMap.SimpleEntry<>(k, v)));
        assert !entrySet.isEmpty();
    }

    @Test
    public void testPutAll() throws IOException {
        map.put("term1", "value1");
        T term = (T) this.get("term1");
        assert term.equals(T.valueOf("value1"));
    }

}