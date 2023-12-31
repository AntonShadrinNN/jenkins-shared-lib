package com.example

import groovy.io.FileType

class ListAll {

    @NonCPS
    def ls (String dir) {
        def res = []
        File root = new File(dir)
        root.eachFileRecurse(FileType.FILES) { file ->
            res << file
        }

        return res
    }
}