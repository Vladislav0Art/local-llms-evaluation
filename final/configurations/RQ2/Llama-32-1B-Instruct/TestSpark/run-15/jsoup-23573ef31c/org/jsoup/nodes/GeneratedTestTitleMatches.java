package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTitleMatches {

    private TestSpark spark = new TestSpark();

    @Test
    public void testTitleMatches() throws Exception {
        assertEquals("Example", addTest(new DocumentExpectation()).addTest(document).before());
        assertEquals("New Title", addTest(new DocumentExpectation()).addTest(document).after());
    }

    private TestSpark addTest(DocumentExpectation expectation) throws Exception {
        return spark.addTest(expectation);
    }

}