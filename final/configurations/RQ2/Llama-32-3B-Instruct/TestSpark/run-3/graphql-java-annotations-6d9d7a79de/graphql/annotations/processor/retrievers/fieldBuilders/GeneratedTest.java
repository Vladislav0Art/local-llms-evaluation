package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;
import java.util.List;

import static graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import static graphql.annotations.processor.exceptions.GraphQLAnnotationsException.newGraphQlAnnotationsException;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ProcessingElementsContainer container;

    public DirectivesBuilder createDirectivesBuilder(AnnotatedElement object) {
        return new DirectivesBuilder(object, this.container);
    }

    @Test
    public void givenFieldAnnotationThatHasNoDirectivesWhenBuildThenReturnsEmptyArray() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        Mockito.when(element.isAnnotationPresent(DirectivesBuilder.class)).thenReturn(false);

        List<GraphQLDirective> expected = emptyList();

        DirectivesBuilder builder = createDirectivesBuilder(element);
        GraphQLDirective[] actual = builder.build();
        assertEquals(expected, actual);
    }

    @Test
    public void givenFieldAnnotationThatHasOneDirectiveWhenBuildThenReturnsArrayWithSingleDirective() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        Mockito.when(element.isAnnotationPresent(DirectivesBuilder.class)).thenReturn(true);

        GraphQLDirectives directives = Mockito.mock(GraphQLDirectives.class);
        Method method = Mockito.mock(Method.class);
        Mockito.when(directives.getMethods()).thenReturn(toList(Arrays.asList(method)));
        Mockito.when(method.getName()).thenReturn("name");

        List<GraphQLDirective> expected = Arrays.asList(newDirective("name"));
        DirectivesBuilder builder = createDirectivesBuilder(element);
        GraphQLDirective[] actual = builder.build();
        assertEquals(expected, actual);
    }

    @Test
    public void givenFieldAnnotationThatHasMultipleDirectivesWhenBuildThenReturnsArrayWithAllDirectives() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        Mockito.when(element.isAnnotationPresent(DirectivesBuilder.class)).thenReturn(true);

        GraphQLDirectives directives1 = Mockito.mock(GraphQLDirectives.class);
        Method method1 = Mockito.mock(Method.class);
        Mockito.when(directives1.getMethods()).thenReturn(toList(Arrays.asList(method1)));
        Mockito.when(method1.getName()).thenReturn("name1");

        GraphQLDirectives directives2 = Mockito.mock(GraphQLDirectives.class);
        Method method2 = Mockito.mock(Method.class);
        Mockito.when(directives2.getMethods()).thenReturn(toList(Arrays.asList(method2)));
        Mockito.when(method2.getName()).thenReturn("name2");

        List<GraphQLDirective> expected = Arrays.asList(newDirective("name1"), newDirective("name2"));
        DirectivesBuilder builder = createDirectivesBuilder(element);
        GraphQLDirective[] actual = builder.build();
        assertEquals(expected, actual);
    }

    @Test
    public void whenAnnotatedElementLacksDirectivesAnnotationThenBuildReturnsEmptyArray() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);

        List<GraphQLDirective> expected = emptyList();
        DirectivesBuilder builder = createDirectivesBuilder(element);
        GraphQLDirective[] actual = builder.build();
        assertEquals(expected, actual);
    }

    @Test
    public void whenBuildingDirectivesThrowsExceptionThenThrowSameException() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);

        GraphQLAnnotationsException exception = newGraphQlAnnotationsException("Error");
        Mockito.when(element.isAnnotationPresent(DirectivesBuilder.class)).thenReturn(true);
        DirectiveJavaAnnotationUtil.addDirectiveAnnotation(element, Mockito.any(GraphQLDirectives.class));

        assertTrue(() -> {
            DirectivesBuilder builder = createDirectivesBuilder(element);
            try {
                builder.build();
            } catch (GraphQLAnnotationsException e) {
                assertEquals(exception, e);
            }
        });
    }

}