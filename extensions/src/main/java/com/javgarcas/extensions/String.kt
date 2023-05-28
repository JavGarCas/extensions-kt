package com.javgarcas.extensions

import java.util.regex.Pattern

fun String.Companion.empty() = ""

fun String.Companion.space() = " "

fun String?.safeString() = this ?: String.empty()

fun String.isValidEmail(pattern: Pattern = Pattern.compile(EMAIL_PATTERN)) = pattern.matcher(this).matches()

