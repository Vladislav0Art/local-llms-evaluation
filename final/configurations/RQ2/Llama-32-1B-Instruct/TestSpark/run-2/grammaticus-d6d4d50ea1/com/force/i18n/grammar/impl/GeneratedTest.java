package com.force.i18n.grammar.impl;

public class GeneratedTest {

    private String[] emptyStringSet = new String[0];
    private Set<String>[] emptySet = new HashSet[0];

    @Test
    public void testGetEmpty() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term = null;
        try {
            term = map.get("term");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

    @Test
    public void testGetEmptyTermsToInclude() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term1 = null;
        T term2 = null;

        map.putAll(new HashMap<>());
        try {
            set = map.get("term1");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

    @Test
    public void testGetEmptyTermsToIncludeSkipList() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term1 = null;
        T term2 = null;

        map.putAll(new HashMap<>());
        try {
            set = map.get("term1");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

    @Test
    public void testGetEmptyTermsToIncludeSkipListNull() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term1 = null;
        T term2 = null;

        map.putAll(new HashMap<>());
        try {
            set = map.get("term1");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

    @Test
    public void testGetTermsToInclude() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term1 = null;
        T term2 = null;

        map.putAll(new HashMap<>());
        try {
            set = map.get("term1");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

    @Test
    public void testGetTermsToIncludeSkipList() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term1 = null;
        T term2 = null;

        map.putAll(new HashMap<>());
        try {
            set = map.get("term1");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

    @Test
    public void testGetTermsToIncludeSkipListNull() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term1 = null;
        T term2 = null;

        map.putAll(new HashMap<>());
        try {
            set = map.get("term1");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

    @Test
    public void testGetTermsToIncludeSkipListEmpty() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term1 = null;

        try {
            set = map.get("term1");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

    @Test
    public void testGetTermsToIncludeNull() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term1 = null;

        try {
            set = map.get("term1");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

    private void set(HashMap<String, T> map) {
        emptyStringSet = map.keySet().toArray(new String[emptyStringSet.length]);
        emptySet = new HashSet<>(map.values());
    }

}