package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedPutUserDataTest {

    @Test
    public void putUserDataTest() {
        Attributes attrs = new Attributes();
        attrs.putUserData("UserDataKey", "UserDataValue");
        Assert.assertNotNull(attrs.getUserData("UserDataKey"));
    }

}