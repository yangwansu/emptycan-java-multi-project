package io.agistep.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class GitHookUpPlugin implements Plugin<Project> {

    public static final String DEFAULT_PATH = ".githooks"
    public static final String GIT_HOOKS_EXTENSION_NAME = "gitHooks"


    @Override
    void apply(Project project) {
        def gitHook = createExtension(GIT_HOOKS_EXTENSION_NAME, project)

        project.afterEvaluate {
            configPathOf(gitHook, project)
        }

        project.tasks.register("hookUp") {
            configPathOf(gitHook, project)
        }
    }

    private static Object createExtension(String name, Project project) {
        def gitHook = project.extensions.create(name, GitHookUpPluginExtension.class)
        gitHook.path.convention(DEFAULT_PATH)
        gitHook
    }

    private static void configPathOf(gitHook, Project project) {
        def path = gitHook.path.get()
        project.exec {
            commandLine 'git', 'config', 'core.hooksPath', "$path"
        }
    }
}

