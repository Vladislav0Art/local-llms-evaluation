package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGetRootEntriesTest {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
    private Property<?> property = mock(Property.class);

    @Test
    public void getRootEntriesTest() {
        Map<String, Object> rootEntriesMap = propertyListBuilder.getRootEntries();
        assertTrue(rootEntriesMap instanceof LinkedHashMap);
    }

}