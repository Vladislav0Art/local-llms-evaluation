package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedConnection {

    @Test
    public void connection() {
        Document document = new Document();
        assert document.connection() == null;
    }

}