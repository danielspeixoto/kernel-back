class ProjectContract {
    interface Controller {}

    interface UseCase {}

    interface Repository {
        fun insert(project: Project)
    }
}