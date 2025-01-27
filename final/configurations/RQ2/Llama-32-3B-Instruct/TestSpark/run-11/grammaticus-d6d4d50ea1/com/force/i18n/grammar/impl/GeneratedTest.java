package com.force.i18n.grammar.impl;

public class GeneratedTest {

    private String id;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

public class GrammaticalTermMap {

    private final Map<String, GrammaticalTerm> terms;

    public GrammaticalTermMap() {
        this.terms = new HashMap<>();
    }

    public boolean isEmpty() {
        return terms.isEmpty();
    }

    public void put(String termId, GrammaticalTerm term) {
        terms.put(termId, term);
    }

    public void remove(String termId) {
        terms.remove(termId);
    }
}

public class GrammaticalTermMapTest {

    @Test
    public void testEmptyMapIsTrue() {
        assert (new GrammaticalTermMap().isEmpty());
    }

    @Test
    public void testNonEmptyMapIsFalse() {
        var map = new GrammaticalTermMap();
        map.put("test", new GrammaticalTermImpl("test", "content"));
        map.put("test2", new GrammaticalTermImpl("test2", "content2"));
        assert !map.isEmpty();
    }

    @Test
    public void testAddition() {
        var map = new GrammaticalTermMap();
        map.put("test1", new GrammaticalTermImpl("test1", "content1"));
        map.put("test2", new GrammaticalTermImpl("test2", "content2"));
        assert !map.isEmpty();
    }

    @Test
    public void testAdditionAndRemoval() {
        var map = new GrammaticalTermMap();
        map.put("test1", new GrammaticalTermImpl("test1", "content1"));
        map.put("test2", new GrammaticalTermImpl("test2", "content2"));
        assert !map.isEmpty();

        map.remove("test1");
        assert map.isEmpty();
    }
}

public class GrammaticalTermImpl implements GrammaticalTerm {
    private final String id;
    private final String content;

    public GrammaticalTermImpl(String id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public String getId() {
        return id;
    }

}