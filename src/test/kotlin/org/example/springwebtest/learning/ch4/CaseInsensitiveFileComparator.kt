package org.example.springwebtest.learning.ch4

import java.io.File

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = false)
    }
}