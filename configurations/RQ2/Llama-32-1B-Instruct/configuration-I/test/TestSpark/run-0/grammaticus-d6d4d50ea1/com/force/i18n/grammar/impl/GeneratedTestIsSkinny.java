package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.jupiter.api.Test;

public class GeneratedTestIsSkinny {

    public static void main(String[] args) {
        // ... (test setup and initialization)
    }

    @Test
    public void testIsSkinny() {
        GrammaticalTermMapImpl<String, String> skinnyGrammar = new GrammaticalTermMapImpl<>();
        assertTrue(skinnyGrammar.isSkinny());

        GrammaticalTermMapImpl<String, String> skinnyGrammarNotSkinny = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertFalse(skinnyGrammarNotSkinny.isSkinny());
    }

}