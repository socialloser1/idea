package com.github.socialloser1.idea.services

import com.intellij.openapi.project.Project
import com.github.socialloser1.idea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
