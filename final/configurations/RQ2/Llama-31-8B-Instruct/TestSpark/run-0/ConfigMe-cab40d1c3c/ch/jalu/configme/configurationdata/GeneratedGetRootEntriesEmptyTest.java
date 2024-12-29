package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntriesEmptyTest {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void getRootEntriesEmptyTest() {
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertNotNull(rootEntries);
        assertTrue(rootEntries.isEmpty());
    }

}