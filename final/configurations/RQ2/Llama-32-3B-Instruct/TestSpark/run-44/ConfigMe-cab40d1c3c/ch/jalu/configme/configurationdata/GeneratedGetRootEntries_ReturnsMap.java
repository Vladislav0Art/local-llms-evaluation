package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntries_ReturnsMap {

    @Mock
    private Property<?> property;

    @Mock
    private Map<String, Object> rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void getRootEntries_ReturnsMap() {
        when(rootEntries).thenReturn(new LinkedHashMap<>());
        Map<String, Object> result = propertyListBuilder.getRootEntries();
        assertTrue(result instanceof Map);
    }

}