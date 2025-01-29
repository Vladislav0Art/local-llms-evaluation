package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestClassNames {

    @Test
    public void testClassNames() {
        Node node = new Node();
        String[] classNames = {"class1", "class2"};
        for (String className : classNames) {
            node.addClass(className);
        }
        assertThat(node.classNames(), org.junit.Assert.assertEquals(new HashSet<>(Arrays.asList("class1", "class2")), node.classNames()));
    }

}