package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    @Mock
    private GraphQLDirectives graphQLDirectives;

    @Mock
    private GraphQLDirective graphQLDirective;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void buildDirectivesTest() {
        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(graphQLDirectives);
        when(graphQLDirectives.value()).thenReturn(new GraphQLDirective[]{graphQLDirective});

        GraphQLDirective[] result = directivesBuilder.build();

        assertNotNull(result);
    }

    @Test
    public void buildDirectivesWithoutGraphQLDirectivesTest() {
        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(null);

        GraphQLDirective[] result = directivesBuilder.build();

        assertNotNull(result);
    }

}