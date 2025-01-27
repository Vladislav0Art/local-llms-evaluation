package com.force.i18n.grammar.impl;

public class GeneratedTestEmptyMapIsTrue {

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

}