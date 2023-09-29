package io.agistep.gradle.plugins

import org.gradle.api.provider.Property

interface GitHookUpPluginExtension {
    Property<String> getPath()
}