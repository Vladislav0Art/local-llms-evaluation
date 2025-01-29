package com.force.i18n.grammar.impl;

import java.util.HashSet;
import java.util.Set;

public class GeneratedTestAdd {

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
    public void testAdd() {
        Term term = new Term("test");
        map.addTerm(term);

        System.out.println(map.terms); // contains all terms

        map.addTerm(new GrammaticalTerm("test2", 1));
        System.out.println(map.terms.size()); // 2
    }

}