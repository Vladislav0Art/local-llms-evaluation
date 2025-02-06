package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedSourceNodes_FromDoc_ReturnsList {

    @Test
    public void sourceNodes_FromDoc_ReturnsList() {
        List<org.jsoup.nodes.Node> out = W3CDom.sourceNodes(null, org.jsoup.nodes.Node.class);
        assertNotNull(out);
    }

}