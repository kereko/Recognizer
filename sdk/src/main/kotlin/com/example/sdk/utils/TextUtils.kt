package com.example.sdk.document

import com.google.mlkit.vision.text.Text

fun Text.isTextEmpty(): Boolean{
    return textBlocks.all { textBlock->
        textBlock.lines.all { line->
            line.elements.all { element->
                element.text.trim().isBlank()
            }
        }
    }
}