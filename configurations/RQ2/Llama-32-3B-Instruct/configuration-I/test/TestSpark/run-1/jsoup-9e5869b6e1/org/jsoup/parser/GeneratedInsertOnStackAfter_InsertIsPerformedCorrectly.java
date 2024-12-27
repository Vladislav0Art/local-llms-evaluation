package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedInsertOnStackAfter_InsertIsPerformedCorrectly {

    @Test
    public void insertOnStackAfter_InsertIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element after = new Element();
        Element in = new Element();
        builder.insertOnStackAfter(after, in);
        assertTrue(builder.onStack(in));
    }

}