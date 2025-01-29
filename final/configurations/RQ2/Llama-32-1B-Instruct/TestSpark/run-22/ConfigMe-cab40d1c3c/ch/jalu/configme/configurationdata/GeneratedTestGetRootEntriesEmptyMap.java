package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetRootEntriesEmptyMap {

    @Test
    public void testGetRootEntriesEmptyMap() {
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(0, builder.getRootEntries().size());
    }

}