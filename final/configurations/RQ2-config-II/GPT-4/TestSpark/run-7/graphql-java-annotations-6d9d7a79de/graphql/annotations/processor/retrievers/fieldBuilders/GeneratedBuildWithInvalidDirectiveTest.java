package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithInvalidDirectiveTest {

    @GraphQLDirectives(ids = {"id1", "id2"})
    private int testField;

    @Test
    public void buildWithInvalidDirectiveTest() throws NoSuchFieldException {
        Field field = this.getClass().getDeclaredField("testField");
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        when(container.getDirective("id1")).thenReturn(null);

        DirectivesBuilder builder = new DirectivesBuilder(field, container);

        builder.build();
    }

}