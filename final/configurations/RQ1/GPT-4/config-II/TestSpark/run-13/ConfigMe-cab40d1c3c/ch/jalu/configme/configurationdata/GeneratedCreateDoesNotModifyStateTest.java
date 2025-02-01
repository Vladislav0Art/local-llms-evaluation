package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateDoesNotModifyStateTest {

    @Test
    public void createDoesNotModifyStateTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        // adding a few properties
        builder.add(new TestProperty("database.url"));
        builder.add(new TestProperty("database.username"));
        builder.add(new TestProperty("database.password"));

        // number of root entries before create
        int rootEntriesBefore = builder.getRootEntries().size();

        builder.create();

        // number of root entries after create
        int rootEntriesAfter = builder.getRootEntries().size();

        assertEquals(rootEntriesBefore, rootEntriesAfter);
    }

}