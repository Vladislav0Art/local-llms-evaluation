package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestNewTreeBuilder {

    public static String getDocTree(int length, int[][] treeNodes) {
        // Generate tree nodes for the document
        StringBuilder[] nodes = new StringBuilder[length];
        for (int i = 0; i < length; i++) {
            nodes[i] = new StringBuilder("Document");
        }

        TreeBuilder treeBuilder = new TreeBuilder(nodes);

        // Parse the input string into a Document object
        Parser parser = new MockParser();
        return treeBuilder.parseFragment(input, "", parser);
    }

    @Test
    public void testNewTreeBuilder() {
        TreeBuilder treeBuilder = new TreeBuilder();
        System.out.println(treeBuilder.parseFragment("This is a document with some text and a comment.", "", null));
    }

}