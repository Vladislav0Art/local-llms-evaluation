package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static graphql.schema.GraphQLDirective.newDirective;
import static graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import static graphql.annotations.processor.ProcessingElementsContainer.*;
import static graphql.annotations.processor.exceptions.GraphQLAnnotationsException.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ProcessingElementsContainer container;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void givenDirectivesBuilderWhenInitializedThenDirectivesBuilderCreated() {
        directivesBuilder = new DirectivesBuilder(getAnnotatedElement(), container);
        assertNotNull(directivesBuilder);
    }

    @Test
    public void givenDirectivesBuilderWhenBuildThenDirectivesReturnedCorrectly() throws Exception {
        GraphQLDirective directive1 = newDirective("directive1", Arrays.asList(GraphQLArgument.of("arg")));
        GraphQLDirective directive2 = newDirective("directive2", Arrays.asList(GraphQLArgument.of("arg")));

        List<GraphQLDirective> directives = Arrays.asList(directive1, directive2);
        Mockito.when(container.getDirectives()).thenReturn(directives);

        Method buildMethod = DirectivesBuilder.class.getMethod("build");
        Object result = buildMethod.invoke(directivesBuilder);
        assertNotNull(result);
    }

    @Test
    public void givenDirectivesBuilderWhenBuildDirectiveThenDirectiveReturnedCorrectly() throws Exception {
        String directiveName = "directive1";
        List<GraphQLArgument> arguments = Arrays.asList(GraphQLArgument.of("arg"));
        GraphQLDirective expectedDirective = newDirective(directiveName, arguments);

        Mockito.when(container.getDirective(directiveName)).thenReturn(expectedDirective);

        Method buildMethod = DirectivesBuilder.class.getMethod("build");
        Object result = buildMethod.invoke(directivesBuilder);
        assertEquals(expectedDirective, result);
    }

    @Test
    public void givenAnnotatedElementWithDirectivesWhenBuildThenDirectivesReturnedCorrectly() throws Exception {
        AnnotatedElement annotatedElement = getAnnotatedElementWithDirectives();
        ProcessingElementsContainer processingElementsContainer = new ProcessingElementsContainer(annotatedElement);

        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        directivesBuilder.build();

        Method buildMethod = DirectivesBuilder.class.getMethod("build");
        Object result = buildMethod.invoke(directivesBuilder);
        assertNotNull(result);
    }

    @Test
    public void givenAnnotatedElementWithoutDirectivesWhenBuildThenEmptyArrayReturned() throws Exception {
        AnnotatedElement annotatedElement = getAnnotatedElementWithoutDirectives();
        ProcessingElementsContainer processingElementsContainer = new ProcessingElementsContainer(annotatedElement);

        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        Object result = directivesBuilder.build();
        assertTrue(result instanceof List && ((List<?>) result).isEmpty());
    }

    private AnnotatedElement getAnnotatedElementWithDirectives() {
        return new Object() {
        };
    }

    private AnnotatedElement getAnnotatedElementWithoutDirectives() {
        return null;
    }

}