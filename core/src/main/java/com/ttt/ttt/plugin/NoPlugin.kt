package com.ttt.ttt.plugin

import com.ttt.ttt.Core.app

object NoPlugin : Plugin() {
    override val id: String get() = ""
    override val label: CharSequence get() = app.getText(com.ttt.ttt.core.R.string.plugin_disabled)
}
