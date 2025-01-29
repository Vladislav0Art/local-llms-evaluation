package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testGetMethod() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .get("test")
                .assertSame(TestUtils.getGrammaticalTerm("test"));
    }

    @Test
    public void testKeySetMethod() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .keySet()
                .assertThat(sets -> sets.containsAll(TestUtils.getGrammaticalTerms("test")));
    }

    @Test
    public void testKeyValuePairs() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .put("test", TestUtils.getGrammaticalTerm("test"));
        Set<Map.Entry<String, T>> entrySet = TestUtils.createGrammaticalTermMap(new HashMap<>(), true).entrySet();
        TestUtils.assertThat(entrySet, entrySet::contains);
    }

    @Test
    public void testIsEmptyMethod() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .isEmpty()
                .assertThat(false);
    }

    @Test
    public void testPutAllMethodWithNonEmptyMap() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), false)
                .put("test", TestUtils.getGrammaticalTerm("test"));
        Set<Map.Entry<String, T>> entrySet = TestUtils.createGrammaticalTermMap(new HashMap<>(), true).entrySet();
        TestUtils.assertThat(entrySet, entrySet::contains);
    }

    @Test
    public void testPutAllMethodWithEmptyMap() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), false)
                .put("test", TestUtils.getGrammaticalTerm("test"));
        Set<Map.Entry<String, T>> entrySet = TestUtils.createGrammaticalTermMap(new HashMap<>(), true).entrySet();
        TestUtils.assertThat(entrySet, entrySet::isEmpty);
    }

    @Test
    public void testEqualsMethod() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .equals(TestUtils.getGrammaticalTermMap(new HashMap<>(), false))
                .assertThat(true);
    }

    @Test
    public void testHashCodeMethod() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .hashCode()
                .assertThat(123L);
    }

    @Test
    public void testIsSkinnyMethod() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .isSkinny()
                .assertThat(true);
    }

}