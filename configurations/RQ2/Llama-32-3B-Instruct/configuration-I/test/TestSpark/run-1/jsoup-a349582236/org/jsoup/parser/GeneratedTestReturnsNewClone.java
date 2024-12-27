package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestReturnsNewClone {

    @Test
    public void testReturnsNewClone() {
        Tag expected = new Tag();
        org.junit.Assert.assertTrue(Tag.clone().equals(expected));
    }
}

public class GeneratedTest2 {

    public boolean tagWithSettings(Tag tag1, Tag tag2) {
        return tag1.getName().equals(tag2.getName());
    }

    public boolean tagWithoutSettings(Tag tag1, Tag tag2) {
        return !tag1.getName().equals(tag2.getName());
    }

    public boolean setsSelfClosing(Tag tag) {
        return true;
    }

    public boolean returnsEqualsForEqualTags(Tag tag1, Tag tag2) {
        return tag1.getName().equals(tag2.getName());
    }

    public boolean returnsFalseForUnequalTags(Tag tag1, Tag tag2) {
        return !tag1.getName().equals(tag2.getName());
    }

    public int returnsSameHashForEqualTags(Tag tag1, Tag tag2) {
        return 0;
    }

    public String returnsToStringForTag(Tag tag) {
        return "";
    }

    public boolean returnsNewClone(Tag tag) {
        return false;
    }

}