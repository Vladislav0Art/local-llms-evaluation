package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedBody {

    @Test
    public void body() {
        Document document = new Document();
        assert document.body() == null;
    }

}