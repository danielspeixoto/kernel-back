package graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import entities.project.ProjectController
import entities.project.ProjectRepository
import entities.project.ProjectUseCase

class Query : GraphQLQueryResolver {

    private val projectController =
        ProjectController(ProjectUseCase(ProjectRepository()))

    fun getProjects() =
            projectController.getProjects()

}