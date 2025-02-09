package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithDirectivesTest {

    @Test
    public void buildWithDirectivesTest() throws Exception {
        Field field = SampleClass.class.getDeclaredField("fieldWithDirectives");
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);

        GraphQLDirective[] directives = directivesBuilder.build();

        assertEquals(2, directives.length);
    }

}