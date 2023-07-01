import groovy.io.FileType

class ShellScripts {
    String dir = '/var/lib'

    def ls () {
        def res = []
        File root = new File(dir)
        root.eachFileRecurse(FileType.FILES) { file ->
            res << file
        }

        return res
    }
}