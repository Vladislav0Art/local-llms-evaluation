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
public class GeneratedGetRootEntriesTest {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Mock
    private Property<Object> property;

    @Test
    public void getRootEntriesTest() {
        propertyListBuilder.add(property);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        verify(property, times(1)).getDefaultValue();
        assertNotNull(rootEntries);
        assertEquals(1, rootEntries.size());
    }

}