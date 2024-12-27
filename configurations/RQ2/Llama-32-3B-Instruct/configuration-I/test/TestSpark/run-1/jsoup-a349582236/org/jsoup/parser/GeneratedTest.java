package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTest {

    @Test
    public void testTagWithSettingsReturnsTagWithSettings() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        Mockito.when(tag1.getName()).thenReturn("tag");
        Mockito.when(tag2.getName()).thenReturn("tag");
        boolean actual = org.junit.Assert.assertTrue(TagWithSettings(tag1, tag2));
    }

    @Test
    public void testTagWithoutSettingsReturnsTagWithoutSettings() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        Mockito.when(tag1.getName()).thenReturn("tag");
        Mockito.when(tag2.getName()).thenReturn("otherTag");
        boolean actual = org.junit.Assert.assertFalse(TagWithoutSettings(tag1, tag2));
    }

    @Test
    public void testSetsSelfClosingSetsSelfClosingFlag() {
        Tag tag1 = new Tag();
        Tag expected = new Tag();
        org.junit.Assert.assertTrue(Tag.setSelfClosing(tag1).equals(expected));
    }

    @Test
    public void testReturnsEqualsForEqualTags() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        Mockito.when(tag1.getName()).thenReturn("tag");
        Mockito.when(tag2.getName()).thenReturn("tag");
        boolean actual = org.junit.Assert.assertTrue(Tag.equals(tag1, tag2));
    }

    @Test
    public void testReturnsFalseForUnequalTags() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        Mockito.when(tag1.getName()).thenReturn("tag");
        Mockito.when(tag2.getName()).thenReturn("otherTag");
        boolean actual = org.junit.Assert.assertFalse(Tag.equals(tag1, tag2));
    }

    @Test
    public void testReturnsSameHashForEqualTags() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        Mockito.when(tag1.getName()).thenReturn("tag");
        Mockito.when(tag2.getName()).thenReturn("tag");
        int actual = org.junit.Assert.assertEquals(Tag.hashCode(tag1), Tag.hashCode(tag2));
    }

    @Test
    public void testReturnsToStringForTag() {
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn("tag");
        String actual = org.junit.Assert.assertEquals(Tag.toString(tag).toString(), "tag");
    }

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