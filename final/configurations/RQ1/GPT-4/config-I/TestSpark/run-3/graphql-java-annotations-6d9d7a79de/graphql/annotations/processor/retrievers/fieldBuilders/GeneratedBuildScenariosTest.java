package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.AnnotatedElement;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildScenariosTest {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private graphql.annotations.processor.ProcessingElementsContainer container;

    @Mock
    private GraphQLDirective directive;

    @Test
    public void buildScenariosTest() {
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, container);
        when(container.getDirectiveRegistry().containsKey("name")).thenReturn(true);
        when(container.getDirectiveRegistry().get("name").getDirective()).thenReturn(directive);

        GraphQLDirective[] result = builder.build();
        assertArrayEquals(new GraphQLDirective[]{directive}, result);
    }

}