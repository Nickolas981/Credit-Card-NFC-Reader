package com.gum.cc_nfc_reader.utils

class StringUtils {

    companion object {
        fun deleteWhitespace(line: String): String {
            return line.filterNot { it.isWhitespace() }
        }

        fun isNotBlank(line: String): Boolean = line.isNotBlank()

    }
}