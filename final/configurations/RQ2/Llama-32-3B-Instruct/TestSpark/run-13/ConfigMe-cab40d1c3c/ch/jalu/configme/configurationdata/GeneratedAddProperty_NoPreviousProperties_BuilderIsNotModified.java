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

public class GeneratedAddProperty_NoPreviousProperties_BuilderIsNotModified {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_NoPreviousProperties_BuilderIsNotModified() {
        List<Property<?>> properties = new ArrayList<>();
        propertyListBuilder.add(properties);
        assertThat(propertyListBuilder.create(), is(properties));
    }

}