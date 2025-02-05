package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist defaultList = new Safelist();
        Safelist copiedList = new Safelist(defaultList);

        Assert.assertEquals(defaultList, copiedList);
    }

}