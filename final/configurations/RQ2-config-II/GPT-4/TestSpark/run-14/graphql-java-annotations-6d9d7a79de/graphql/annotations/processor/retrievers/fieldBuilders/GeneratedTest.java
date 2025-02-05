package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedTest {

    @Test
    public void buildWhenObjectIsNullTest() {
        new DirectivesBuilder(null, new ProcessingElementsContainer()).build();
    }

    @Test
    public void buildWithValidObjectTest() {
        Field field = Mockito.mock(Field.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[0]);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        GraphQLDirective[] directives = new DirectivesBuilder(field, container).build();
        Assert.assertNotNull(directives);
    }

    @Test
    public void buildWithNonDirectiveAnnotationTest() {
        Field field = Mockito.mock(Field.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{new Override()});
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        GraphQLDirective[] directives = new DirectivesBuilder(field, container).build();
        Assert.assertEquals(0, directives.length);
    }

    @Test
    public void buildWithDirectiveWithoutValuesTest() {
        Field field = Mockito.mock(Field.class);
        GraphQLDirectives directivesAnnotation = Mockito.mock(GraphQLDirectives.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{directivesAnnotation});
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        GraphQLDirective[] directives = new DirectivesBuilder(field, container).build();

        Assert.assertEquals(1, directives.length);
        Assert.assertEquals(directivesAnnotation.name(), directives[0].getName());
    }

    @Test
    public void buildWithDirectiveWithValuesTest() {
        Field field = Mockito.mock(Field.class);
        GraphQLDirectives directivesAnnotation = Mockito.mock(GraphQLDirectives.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{directivesAnnotation});
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        GraphQLDirective[] directives = new DirectivesBuilder(field, container).build();

        Assert.assertEquals(1, directives.length);
        Assert.assertEquals(directivesAnnotation.name(), directives[0].getName());
        Assert.assertEquals(directivesAnnotation.value(), directives[0].getArgument(directivesAnnotation.name()).getValue());
    }

}