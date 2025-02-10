package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedCreateEmptyListWhenNoPropertiesAdded {

    @Test
    public void createEmptyListWhenNoPropertiesAdded() {
        List<Property<?>> list = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertThat(builder.create(), is(list));
    }

}