package net.mbonnin.arcanetracker.detector

import java.nio.ByteBuffer

class FeatureExtractor {
    init {
        System.loadLibrary("feature_extractor")
    }

    private lateinit var vector: DoubleArray

    /*
     * x, y, w, h represent the input rect where to compute the features
     */
    external private fun getFeatures(byteBuffer: ByteBuffer, stride: Int, x: Double, y: Double, w: Double, h: Double, features: DoubleArray)

    external private fun allocateVector(): DoubleArray


    constructor() {
        vector = allocateVector()
    }

    fun getFeatures(byteBuffer: ByteBuffer, stride: Int, x: Double, y: Double, w: Double, h: Double): DoubleArray {
        getFeatures(byteBuffer, stride, x, y, w, h, vector)
        return vector
    }
}