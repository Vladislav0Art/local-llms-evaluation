package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildNullContainerTest {

    @Test
    public void buildNullContainerTest() {
        Field object = Mockito.mock(Field.class);
        Object container = null;
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = builder.build();
    }

}