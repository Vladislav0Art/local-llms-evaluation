package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedAddPropertyToListWithoutException {

    @Test
    public void addPropertyToListWithoutException() {
        List<Property<?>> list = new ArrayList<>();
        Property<?> property = Mockito.mock(Property.class);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);
        assertThat(builder.create(), is(list));
    }

}