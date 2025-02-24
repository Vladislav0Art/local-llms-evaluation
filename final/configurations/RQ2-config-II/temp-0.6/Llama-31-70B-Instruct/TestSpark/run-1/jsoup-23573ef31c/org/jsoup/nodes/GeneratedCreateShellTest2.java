package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;

public class GeneratedCreateShellTest2 {

    @Test
    public void createShellTest2() {
        String baseUri = "";
        Document document = Document.createShell(baseUri);
        Assert.assertEquals(baseUri, document.baseUri());
    }

}