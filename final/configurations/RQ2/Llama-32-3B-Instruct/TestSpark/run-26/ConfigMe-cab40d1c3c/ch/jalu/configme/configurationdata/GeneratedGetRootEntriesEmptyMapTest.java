package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetRootEntriesEmptyMapTest {

    @Test
    public void getRootEntriesEmptyMapTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        assertTrue(builder.getRootEntries().isEmpty());
    }

}