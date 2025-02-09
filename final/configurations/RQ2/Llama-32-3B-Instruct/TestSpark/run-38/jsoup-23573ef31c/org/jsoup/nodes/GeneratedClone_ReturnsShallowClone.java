package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedClone_ReturnsShallowClone {

    @Test
    public void clone_ReturnsShallowClone() {
        Document document = new Document("");
        Document shallowClone = document.clone();
        assertNotNull(shallowClone);
    }

}