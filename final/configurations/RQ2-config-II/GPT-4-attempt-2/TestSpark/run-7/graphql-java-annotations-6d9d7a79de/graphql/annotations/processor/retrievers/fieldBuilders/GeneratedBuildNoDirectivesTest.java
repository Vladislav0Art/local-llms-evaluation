package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildNoDirectivesTest {

    @Test
    public void buildNoDirectivesTest() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(field, container);

        GraphQLDirective[] directives = builder.build();
        assertEquals(0, directives.length);
    }

}