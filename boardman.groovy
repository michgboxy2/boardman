job('node_project2') {
    description("Github boardman project")
    scm{
        git("https://github.com/michgboxy2/boardman.git", 'main')
    }
    triggers {
        scm('* * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell('npm install')
    }
}