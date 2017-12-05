package entities.project

import com.coxautodev.graphql.tools.GraphQLResolver

class ProjectController(
        private val useCase: ProjectContract.UseCase
) : ProjectContract.Controller, GraphQLResolver<Project> {

    override fun createProject(name: String) : Project {
        return Project(name)
    }

    fun getProjects() =
        Project("sad")

}