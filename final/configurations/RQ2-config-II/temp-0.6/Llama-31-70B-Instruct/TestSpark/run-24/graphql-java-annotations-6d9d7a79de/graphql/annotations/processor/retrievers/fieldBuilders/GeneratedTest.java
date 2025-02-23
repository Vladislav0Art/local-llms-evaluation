package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildTest() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        directivesBuilder.build();
    }

    @Test
    public void transformArgsTest() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        Annotation annotation = mock(Annotation.class);
        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);
        when(graphQLDirective.getArguments()).thenReturn(List.of());

        directivesBuilder.transformArgs(graphQLDirective, annotation);
    }

}