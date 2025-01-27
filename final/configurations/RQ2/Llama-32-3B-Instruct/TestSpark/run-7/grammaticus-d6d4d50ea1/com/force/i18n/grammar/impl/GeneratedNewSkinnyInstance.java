package com.force.i18n.grammar.impl;

public class GeneratedNewSkinnyInstance {

    @Test
    public void newSkinnyInstance() {
        Map<String, GrammaticalTerm> map = ImmutableMap.of("key", new GrammaticalTerm());
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, true);
        assertNotNull(instance);
    }

}