package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {


    private static final Map<String, String> map = ImmutableMap.of("term1", "value1");
    private static final Set<String> keySet = new HashSet<>(Collections.singletonList("key"));
    private static final Collection<T> values = new ArrayList<>();
    private static final Set<Map.Entry<String, T>> entrySet = new HashSet<>();
    private static final Map<String, String> mapSerializer = new MapSerializer();
    private static final RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
    private static final LanguageDictionary languageDictionary = Mockito.mock(LanguageDictionary.class);

    @Test
    public void testEquals() {
        String term1 = "term1";
        String term2 = "term1";
        GrammaticalTermMapImpl<T> map1 = (GrammaticalTermMap<T>) this;
        GrammaticalTermMapImpl<T> map2 = new GrammaticalTermMapImpl<>(map, true);
        assert (!map1.equals(map2));
    }

}