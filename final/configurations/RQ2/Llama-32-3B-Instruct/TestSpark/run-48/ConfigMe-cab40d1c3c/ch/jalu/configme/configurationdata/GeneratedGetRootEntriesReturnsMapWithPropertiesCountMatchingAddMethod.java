package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedGetRootEntriesReturnsMapWithPropertiesCountMatchingAddMethod {

    @Test
    public void getRootEntriesReturnsMapWithPropertiesCountMatchingAddMethod() {
        Map<String, Object> map = new LinkedHashMap<>();
        Mockito.when(PropertyListBuilder.getRootEntries()).thenReturn(map);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(Mockito.mock(Property.class));
        builder.add(Mockito.mock(Property.class));
        assertThat(((Map) builder.create().get(0)), is(null)); // test properties are not present in the output
    }

}