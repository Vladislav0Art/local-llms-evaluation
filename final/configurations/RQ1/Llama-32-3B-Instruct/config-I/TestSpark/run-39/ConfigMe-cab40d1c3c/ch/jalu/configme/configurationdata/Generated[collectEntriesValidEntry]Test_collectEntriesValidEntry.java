package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Generated[collectEntriesValidEntry]

Test_collectEntriesValidEntry {

    @Mock
    private Map<String, Object> rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder(rootEntries);

    @Test
    public void [collectEntriesValidEntry]Test_collectEntriesValidEntry() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("test", new Property<>("test", "value"));
        propertyListBuilder.collectEntries(map, new ArrayList<>());
        assertTrue(propertyListBuilder.getRootEntries().containsValue(new Property<>("test")));
    }

}