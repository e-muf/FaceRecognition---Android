package com.example.facerecognition.classify.common

data class FaceClassification(
    val faceId: Int,
    val name: String,
    val confidence: Double
)