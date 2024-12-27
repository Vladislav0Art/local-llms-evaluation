package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilderFactory;
import graphql.annotations.processor.retrievers.fieldBuilders.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.AnnotatedElement;
import graphql.annotations.processor.retrievers.fieldBuilders.GraphQLDirective;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_BuildsDirectives_WithNullDirectives_ReturnsEmptyArray {

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void build_BuildsDirectives_WithNullDirectives_ReturnsEmptyArray() {
        // Arrange
        when(annotatedElement.getDirectives()).thenReturn(null);

        // Act
        GraphQLDirective[] actualDirectives = directivesBuilder.build();

        // Assert
        assertArrayEquals(new GraphQLDirective[0], actualDirectives);
    }

}