job('node_project2') {
    description("Github boardman project")
    scm{
        git("https://github.com/michgboxy2/boardman.git", '*/main')
    }
    triggers {
        scm('* * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        remoteShell('ubuntu@3.84.221.74:22') {
            command('touch michy.js')
            command('git clone https://github.com/michgboxy2/boardman.git')
            command('cd boardman')
            command('sudo npm install')
            command('sudo pm2 start index.js')
        }
    }
}