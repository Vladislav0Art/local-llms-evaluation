package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GeneratedCreate_EmptyList_ReturnsEmptyList {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void create_EmptyList_ReturnsEmptyList() {
        List<Property<?>> properties = new ArrayList<>();
        Mockito.when(propertyListBuilder.getRootEntries()).thenReturn(Mockito.mock(Map.class, e -> (Map<String, Object>) e.getOrDefault("properties", new LinkedHashMap<>()))).get("properties");
        assertThat(propertyListBuilder.create(), is(properties));
    }

}