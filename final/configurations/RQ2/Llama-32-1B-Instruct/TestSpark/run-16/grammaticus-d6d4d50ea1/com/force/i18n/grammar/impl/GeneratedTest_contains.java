package com.force.i18n.grammar.impl;

import java.util.HashSet;
import java.util.Set;

public class GeneratedTest_contains {

    private Set<GrammaticalTerm> terms;

    public GrammaticalTermMap() {
        this.terms = new HashSet<>();
    }

    public void addTerm(GrammaticalTerm term) {
        terms.add(term);
    }

    public boolean contains(Term term) {
        return terms.contains(term);
    }
}

class Term {
    private String name;

    public Term(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Term that = (Term) o;
        return Objects.equals(name, that.name);
    }
}

class GrammaticalTerm extends Term {
    private int index;

    public GrammaticalTerm(String name, int index) {
        super(name);
        this.index = index;
    }

    @Override
    public String toString() {
        return "GrammaticalTerm{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}

public class TestGrammaticalTermMap {

    private GrammaticalTermMap map;

    public TestGrammaticalTermMap() {
        this.map = new GrammaticalTermMap();
    }

    public void addTerm(GrammaticalTerm term) {
        map.addTerm(term);
    }

    @Test
    public void test_contains() {
        Term term1 = new Term("test");
        Term term2 = new Term("test2");

        map.addTerm(term1);
        map.addTerm(term2);

        System.out.println(map.contains(term1)); // true
        System.out.println(map.contains(term2)); // false

        map.addTerm(term2); // This should raise an exception

        try {
            map.contains(term1);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // "Value is null"
        }
    }

}