import groovy.io.FileType

class ShellScripts {
    def dir = '/var/lib'
    def res = []
    def root = new File(dir)
    root.eachFileRecurse(FileType.FILES) { file ->
            dir << file
    }

}