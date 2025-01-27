package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;

public class GeneratedWriteJsonSerializesTerms {

    @Test
    public void writeJsonSerializesTerms() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.put("term1", new GrammaticalTerm(HumanLanguage.English));
        map.writeJson(System.out, null, null, null);
        String outJson = MapSerializer.unserialize(outContent.toByteArray());
        assertTrue(outJson.contains("\"term1\":"));
    }

}