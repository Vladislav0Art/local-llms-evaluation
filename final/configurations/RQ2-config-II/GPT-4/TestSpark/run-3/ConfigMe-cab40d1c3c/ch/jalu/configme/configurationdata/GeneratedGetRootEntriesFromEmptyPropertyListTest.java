package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntriesFromEmptyPropertyListTest {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Mock
    private Property<Object> property;

    @Test
    public void getRootEntriesFromEmptyPropertyListTest() {
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertNotNull(rootEntries);
        assertEquals(0, rootEntries.size());
    }

}