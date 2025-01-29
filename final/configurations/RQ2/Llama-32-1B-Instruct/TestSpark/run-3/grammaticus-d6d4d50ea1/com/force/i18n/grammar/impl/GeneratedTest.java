package com.force.i18n.grammar.impl;

public class GeneratedTest {

    private Map<String, T> mockMap;
    private boolean isSkinny;

    @Mock
    private Appendable output;

    public void setUp() throws IOException {
        mockMap = new HashMap<>();
        mockMap.put("testKey", new Noun());
        isSkinny = false;
    }

    @Test
    public void testMakeSkinny() {
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        instance.makeSkinny();
        assertNotNull(instance.isSkinny());
    }

    @Test
    public void testGet() {
        T term = mockTerm("testKey");
        String name = "testName";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.get(name)).thenReturn(term);
        verify(mockTerm).get("testName");
    }

    @Test
    public void testContainsKey() {
        T term = mockTerm("testKey");
        String name = "testName";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.containsKey(name)).thenReturn(true);
        verify(mockTerm).containsKey("testName");
    }

    @Test
    public void testKeySet() {
        T term1 = mockTerm("term1");
        T term2 = mockTerm("term2");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.getKeySet()).thenReturn(ImmutableMap.of(name, term1));
        verify(mockMap).containsKey(name);
    }

    @Test
    public void testGetByName() {
        T term = mockTerm("testKey");
        String name = "testName";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.get("testName")).thenReturn(term);
        verify(mockTerm).get("testName");
    }

    @Test
    public void testKeySetByName() {
        T term1 = mockTerm("term1");
        T term2 = mockTerm("term2");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.getKeySet()).thenReturn(ImmutableMap.of(name, term1));
        verify(mockMap).containsKey(name);
    }

    @Test
    public void testContainsKeyByName() {
        T term1 = mockTerm("term1");
        T term2 = mockTerm("term2");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.containsKey(name)).thenReturn(true);
        verify(mockMap).containsKey(name);
    }

    @Test
    public void testPut() {
        T term = mockTerm("testKey");
        String name = "testName";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.put(name, term)).thenReturn(true);
        verify(mockMap).put(name, term);
    }

    @Test
    public void testPutAll() {
        T term1 = mockTerm("term1");
        T term2 = mockTerm("term2");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.putAll(mockMap)).thenReturn(true);
        verify(mockMap).putAll(mockMap);
    }

    @Test
    public void testIsEmpty() {
        T term1 = mockTerm("term1");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.isEmpty()).thenReturn(true);
        verify(mockMap).isEmpty();
    }

    @Test
    public void testEquals() {
        T term1 = mockTerm("term1");
        String name = "name";
        GrammaticalTermMapImpl<T> instance1 = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        T term2 = mockTerm("testKey");
        String name2 = "name";
        when(instance1.get(name)).thenReturn(term1);
        when(instance2.get(name)).thenReturn(term2);
        assertTrue(instance1.equals(instance2));
    }

    @Test
    public void testHashCode() {
        T term1 = mockTerm("term1");
        String name = "name";
        GrammaticalTermMapImpl<T> instance1 = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        T term2 = mockTerm("testKey");
        String name2 = "name";
        when(instance1.get(name)).thenReturn(term1);
        when(instance2.get(name)).thenReturn(term2);
        assertEquals(instance1.hashCode(), instance2.hashCode());
    }

    @Test
    public void testWriteJson() {
        T term1 = mockTerm("term1");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.writeJson(output, RenamingProvider.empty(), LanguageDictionary.empty(), Collections.emptySet())).thenReturn(true);
        verify(mockOutput).write("testKey");
    }

    @Test
    public void testWriteJsonEmptyOutput() {
        T term1 = mockTerm("term1");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.writeJson(output, RenamingProvider.empty(), LanguageDictionary.empty(), Collections.emptySet())).thenReturn(false);
        verify(mockOutput).write("testKey");
    }

    private T mockTerm(String name) {
        return new Noun();
    }

}