package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GeneratedWriteJsonMethodWorksCorrectly {

    @Test
    public void writeJsonMethodWorksCorrectly() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        RenamingProvider renamingProvider = new RenamingProvider();
        LanguageDictionary dictionary = new LanguageDictionary();
        Collection<String> termsToInclude = new HashSet<>();
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        map.writeJson(oos, renamingProvider, dictionary, termsToInclude);
        oos.flush();
    }

}