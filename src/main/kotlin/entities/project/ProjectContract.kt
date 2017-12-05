package entities.project

class ProjectContract {
    interface Controller {
        fun createProject(name : String) : Project
    }

    interface UseCase {}

    interface Repository {
        fun insert(project: Project)
    }
}